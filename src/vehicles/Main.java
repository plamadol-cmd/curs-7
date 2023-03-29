package vehicles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ParkingLot parkingLot = context.getBean("parkingLot", ParkingLot.class);
        RentACarService rentACarService = context.getBean("rentACarService", RentACarService.class);

        System.out.println(parkingLot.bus.travel());
        System.out.println(parkingLot.bus.printTickets());
        System.out.println(parkingLot.car.travel());
        System.out.println(parkingLot.motorcycle.travel());
        System.out.println("\n" + rentACarService.getMaxSpeed());

        parkingLot.bus.motor.setName("A123456");
        parkingLot.bus.motor.setPower(180);
        parkingLot.bus.motor.setNumberOfCylinders(8);

        System.out.println("\nThe bus has the following specifications:" +
                "\nName: " + parkingLot.bus.motor.getName() +
                "\nPower: " + parkingLot.bus.motor.getPower() +
                "\nNumber of cylinders: " + parkingLot.bus.motor.getNumberOfCylinders());

        context.close();
    }
}
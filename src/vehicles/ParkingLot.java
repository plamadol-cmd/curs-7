package vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ParkingLot {
    @Autowired
    Bus bus;
    Car car;
    Motorcycle motorcycle;

    @Autowired
    ParkingLot(Car car){
        this.car = car;
    }

    @Autowired(required = false)
    public void setMotorcycle(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }

}

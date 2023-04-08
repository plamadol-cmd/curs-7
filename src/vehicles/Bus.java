package vehicles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Bus implements IVehicle {
    Motor motor;

    PrintTicketsService printTicketsService;

    @Autowired
    public Bus(Motor motor, PrintTicketsService printTicketsService){
        this.motor = motor;
        this.printTicketsService = printTicketsService;
    }

    @Override
    public String travel() {
        return "The bus is transporting passengers to another city.";
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 100;
    }

    public String printTickets(){
        return printTicketsService.printTickets();
    }
}

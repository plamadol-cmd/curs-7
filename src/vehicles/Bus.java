package vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus implements IVehicle {

    PrintTicketsService printTicketsService;

    @Autowired
    public Bus(PrintTicketsService printTicketsService){
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

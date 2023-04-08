package vehicles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@Component
public class Car implements IVehicle {
    Motor motor;

    PrintTicketsService printTicketsService;
    GasStationService gasStationService;

    @Autowired
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Autowired(required = false)
    public void setPrintTicketsService(PrintTicketsService printTicketsService){
        this.printTicketsService = printTicketsService;
    }

    @Autowired(required = false)
    private void setGasStationService(GasStationService gasStationService){
        this.gasStationService = gasStationService;
    }

    @Override
    public String travel() {
        return "The car is transporting a delivery.";
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 150;
    }
}

package vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car implements IVehicle {

    PrintTicketsService printTicketsService;
    GasStationService gasStationService;

    @Autowired(required = false)
    public void setPrintTicketsService(PrintTicketsService printTicketsService){
        this.printTicketsService = printTicketsService;
    }

    @Autowired
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

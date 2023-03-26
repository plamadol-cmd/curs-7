package vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motorcycle implements IVehicle {

    @Autowired
    GasStationService gasStationService;

    @Override
    public String travel() {
        return "The motorcycle is traveling through narrow streets.";
    }

    @Override
    public Integer maxDrivingSpeed() {
        return 180;
    }
}

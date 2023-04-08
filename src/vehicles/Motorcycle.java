package vehicles;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Motorcycle implements IVehicle {
    @Autowired
    Motor motor;

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

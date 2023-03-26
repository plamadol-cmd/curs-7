package vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RentACarService {
    @Autowired
    @Qualifier("car")
    private IVehicle redCar;

    public Integer getMaxSpeed(){
        return this.redCar.maxDrivingSpeed();
    }
}

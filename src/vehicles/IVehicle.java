package vehicles;

import org.springframework.beans.factory.annotation.Autowired;

public interface IVehicle {

    public String travel();
    public Integer maxDrivingSpeed();
}

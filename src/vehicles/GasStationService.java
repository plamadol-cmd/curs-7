package vehicles;

import org.springframework.stereotype.Component;

@Component
public class GasStationService {

    private String getGas(){
        return "Tank if full now!";
    }
}

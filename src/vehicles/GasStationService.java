package vehicles;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class GasStationService {

    private String getGas(){
        return "Tank if full now!";
    }
}

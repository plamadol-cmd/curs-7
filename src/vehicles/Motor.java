package vehicles;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Motor {
    Integer power;
    String name;
    Integer numberOfCylinders;
}

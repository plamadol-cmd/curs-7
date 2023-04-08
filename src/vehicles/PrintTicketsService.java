package vehicles;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PrintTicketsService {

    public String printTickets(){
        return "Tickets are printed!";
    }
}

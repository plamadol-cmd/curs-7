package vehicles;

import org.springframework.stereotype.Component;

@Component
public class PrintTicketsService {

    public String printTickets(){
        return "Tickets are printed!";
    }
}

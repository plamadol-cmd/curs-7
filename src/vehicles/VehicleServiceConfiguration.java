package vehicles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class VehicleServiceConfiguration {
    @Bean
    public GasStationService gasStationService(){
        return new GasStationService();
    }

    @Bean
    public RentACarService rentACarService(){
        return new RentACarService();
    }

    @Bean
    public PrintTicketsService printTicketsService(){
        return new PrintTicketsService();
    }

    @Bean
    public ParkingLot parkingLot(){
        return new ParkingLot(new Car());
    }
}

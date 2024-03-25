package by.pvt.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FoodDeliveryOrderLoggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodDeliveryOrderLoggerApplication.class, args);
    }
}

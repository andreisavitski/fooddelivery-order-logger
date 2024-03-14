package by.pvt.logger.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class Order {

    @Id
    private String id;

    private Long clientId;

    private Long courierId;

    private BigDecimal totalCost;

    private LocalDateTime orderDate;
}

package by.pvt.logger.repository;

import by.pvt.logger.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, Long> {
    @Query(value = "{'clientId': ?0 }")
    List<Order> findByClientId(Long clientId);
}

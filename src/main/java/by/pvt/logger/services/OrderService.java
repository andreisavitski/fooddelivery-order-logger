package by.pvt.logger.services;

import by.pvt.logger.dto.OrderAdderDTO;
import by.pvt.logger.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    void addOrder(OrderAdderDTO orderAdderDTO);
    List<OrderDTO> getAllOrders();
    List<OrderDTO> getOrdersByClientId(Long clientId);
}

package by.pvt.logger.services;

import by.pvt.logger.dto.OrderDTO;
import by.pvt.logger.dto.OrderMessageDTO;

import java.util.List;

public interface OrderService {
    void addOrder(OrderMessageDTO orderMessageDTO);

    List<OrderDTO> getAllOrders();

    List<OrderDTO> getOrdersByClientId(Long clientId);
}

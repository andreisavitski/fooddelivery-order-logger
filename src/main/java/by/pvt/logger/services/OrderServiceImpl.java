package by.pvt.logger.services;

import by.pvt.logger.dto.OrderDTO;
import by.pvt.logger.dto.OrderMessageDTO;
import by.pvt.logger.mapper.OrderMapper;
import by.pvt.logger.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    private final OrderMapper orderMapper;

    @Override
    public void addOrder(OrderMessageDTO orderMessageDTO) {
        orderRepository.save(orderMapper.toOrder(orderMessageDTO));
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toOrderDTO)
                .toList();
    }

    @Override
    public List<OrderDTO> getOrdersByClientId(Long clientId) {
        return orderRepository.findByClientId(clientId).stream()
                .map(orderMapper::toOrderDTO)
                .toList();
    }
}

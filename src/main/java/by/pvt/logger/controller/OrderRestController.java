package by.pvt.logger.controller;

import by.pvt.logger.dto.OrderDTO;
import by.pvt.logger.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderRestController {

    private final OrderService orderService;

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/client/{id}")
    public List<OrderDTO> getOrdersByClientId(@PathVariable("id") Long id) {
        return orderService.getOrdersByClientId(id);
    }
}

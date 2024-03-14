package by.pvt.logger.controller;

import by.pvt.logger.dto.OrderAdderDTO;
import by.pvt.logger.dto.OrderDTO;
import by.pvt.logger.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
@RequiredArgsConstructor
public class OrderRestController {

    private final OrderService orderService;

    @PostMapping("add")
    public void addOrder(@RequestBody OrderAdderDTO orderAdderDTO) {
        orderService.addOrder(orderAdderDTO);
    }

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("client/{id}")
    public List<OrderDTO> getOrdersByClientId(@PathVariable("id") Long id) {
        return orderService.getOrdersByClientId(id);
    }
}

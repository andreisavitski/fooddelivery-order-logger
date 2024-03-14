package by.pvt.logger.mapper;

import by.pvt.logger.domain.Order;
import by.pvt.logger.dto.OrderAdderDTO;
import by.pvt.logger.dto.OrderDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    Order toOrder(OrderDTO orderDTO);

    OrderDTO toOrderDTO(Order order);

    Order toOrder(OrderAdderDTO orderAdderDTO);

    OrderDTO toOrderCreateDTO(Order order);
}

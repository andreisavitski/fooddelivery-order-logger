package by.pvt.logger.mapper;

import by.pvt.logger.domain.Order;
import by.pvt.logger.dto.OrderDTO;
import by.pvt.logger.dto.OrderMessageDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDTO toOrderDTO(Order order);

    Order toOrder(OrderMessageDTO orderMessageDTO);
}

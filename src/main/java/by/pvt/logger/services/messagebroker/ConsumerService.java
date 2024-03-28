package by.pvt.logger.services.messagebroker;

import by.pvt.logger.dto.OrderMessageDTO;

public interface ConsumerService {
    void consumeMessage(OrderMessageDTO order);
}

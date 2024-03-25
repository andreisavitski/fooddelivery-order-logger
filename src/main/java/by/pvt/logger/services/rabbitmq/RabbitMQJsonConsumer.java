package by.pvt.logger.services.rabbitmq;

import by.pvt.logger.dto.OrderMessageDTO;

public interface RabbitMQJsonConsumer {
    void consumeJsonMessage(OrderMessageDTO order);
}

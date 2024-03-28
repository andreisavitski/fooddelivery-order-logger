package by.pvt.logger.services.messagebroker.rabbitmq;

import by.pvt.logger.dto.OrderMessageDTO;
import by.pvt.logger.services.OrderService;
import by.pvt.logger.services.messagebroker.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitMQConsumerServiceImpl implements ConsumerService {

    private final OrderService orderService;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumerServiceImpl.class);

    @Override
    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeMessage(OrderMessageDTO message) {
        LOGGER.info(String.format("Received JSON message -> %s", message));
        orderService.addOrder(message);
    }
}

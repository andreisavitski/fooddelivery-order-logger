package by.pvt.logger.services.messagebroker.kafka;

import by.pvt.logger.dto.OrderMessageDTO;
import by.pvt.logger.services.OrderService;
import by.pvt.logger.services.messagebroker.ConsumerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumerServiceImpl implements ConsumerService {

    private final OrderService orderService;

    private final ObjectMapper objectMapper;

    @Override
    @KafkaListener(id = "producerServer", topics = {"server.order"}, containerFactory = "singleFactory")
    public void consumeMessage(OrderMessageDTO order) {
        log.info("=> consumed {}", writeValueAsString(order));
        orderService.addOrder(order);
    }

    private String writeValueAsString(OrderMessageDTO order) {
        try {
            return objectMapper.writeValueAsString(order);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Writing value to JSON failed: " + order.toString());
        }
    }
}

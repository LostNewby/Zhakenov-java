package com.spring.javasp3.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMessage {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerMessage.class);

    @KafkaListener(topics = "topicName", groupId = "foo")
    public void listenGroupFoo(String message) {
        logger.info("Received Message: " + message);
    }

}

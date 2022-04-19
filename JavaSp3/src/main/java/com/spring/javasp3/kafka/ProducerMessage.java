package com.spring.javasp3.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerMessage {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final Logger logger = LoggerFactory.getLogger(ProducerMessage.class);

    public void sendMessage(String msg) {
        this.kafkaTemplate.send("topicName", msg);
        logger.info("Send Message: " + msg);
    }
}

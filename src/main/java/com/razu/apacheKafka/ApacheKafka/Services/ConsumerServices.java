package com.razu.apacheKafka.ApacheKafka.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public final class ConsumerServices {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerServices.class);

    @KafkaListener(topics = "kafkaTopic",groupId = "group_id")
    public void consume(String message){
        logger.info(String.format("$$$$ = > Consumer message : %s",message));
    }
}

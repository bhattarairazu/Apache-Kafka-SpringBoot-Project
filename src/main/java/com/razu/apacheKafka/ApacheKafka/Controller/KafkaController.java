package com.razu.apacheKafka.ApacheKafka.Controller;

import com.razu.apacheKafka.ApacheKafka.Services.ProducerServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final ProducerServices producerServices;

    public KafkaController(ProducerServices producerServices) {
        this.producerServices = producerServices;
    }
    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message){
        producerServices.sendMessage(message);
    }
}

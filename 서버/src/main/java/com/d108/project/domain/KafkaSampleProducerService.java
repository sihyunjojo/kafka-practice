package com.d108.project.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaSampleProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        // topic, message
        this.kafkaTemplate.send("oingdaddy", message);
        System.out.println("send message : " + message);
    }
}

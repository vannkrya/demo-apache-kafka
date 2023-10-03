package com.example.demoapachekafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "krya-topic", groupId = "myGroup")
    public void consumerMessage(String message) {
        System.out.println("received message: " + message);
    }

}

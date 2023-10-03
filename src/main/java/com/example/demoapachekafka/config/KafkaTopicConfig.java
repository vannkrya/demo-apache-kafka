package com.example.demoapachekafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaTopic() {
        return TopicBuilder.name("krya-topic")
//                .partitions(3)
//                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic javaJsonTopic() {
        return TopicBuilder.name("json-topic")
//                .partitions(3)
//                .replicas(1)
                .build();
    }

}

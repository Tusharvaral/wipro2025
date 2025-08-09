package com.example.kafka.producer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerConfig {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerConfig(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("learn-subject", message);
        System.out.println("Sent message: " + message);
    }
}
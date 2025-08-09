package com.example.kafka.consumer;
import com.example.kafka.model.Subject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "learn-subject", groupId = "learn-subject-group", containerFactory = "kafkaListenerContainerFactory")
    public void consume(Subject subject) {
        System.out.println("Consumed Subject: " + subject);
    }
}
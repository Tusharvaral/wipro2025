package com.example.kafka.producer;
import com.example.kafka.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.kafka.core.KafkaTemplate;

@RestController
@RequestMapping("/produce")
public class ProducerController {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC = "learn-subject";

    public ProducerController(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public String sendSubject(@RequestBody Subject subject) {
        kafkaTemplate.send(TOPIC, subject);
        return "Subject sent to Kafka: " + subject;
    }
}
package com.example.kafka.producer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produce")
public class ProducerController {
    private final KafkaProducerConfig producerService;

    public ProducerController(KafkaProducerConfig producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        producerService.sendMessage(message);
        return "Message sent: " + message;
    }
}
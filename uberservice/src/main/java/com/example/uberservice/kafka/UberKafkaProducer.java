package com.example.uberservice.kafka;

import com.example.uberservice.model.RideResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UberKafkaProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC_U2R = "U2R";

    public void sendRideResponse(RideResponse response) {
        kafkaTemplate.send(TOPIC_U2R, response.getRideId(), response);
        System.out.println("Sent ride response to topic U2R: " + response);
    }
}

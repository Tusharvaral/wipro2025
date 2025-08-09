package com.example.riderservice.kafka;

import com.example.riderservice.model.RideRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiderKafkaProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private static final String TOPIC_R2U = "R2U";

    public void sendRideRequest(RideRequest request) {
        kafkaTemplate.send(TOPIC_R2U, request.getRideId(), request);
        System.out.println("Sent ride request to topic R2U: " + request);
    }
}

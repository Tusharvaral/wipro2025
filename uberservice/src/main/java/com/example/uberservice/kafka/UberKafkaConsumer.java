package com.example.uberservice.kafka;

import com.example.uberservice.model.RideRequest;
import com.example.uberservice.model.RideResponse;
import com.example.uberservice.model.entity.UberRideEntity;
import com.example.uberservice.repository.UberRideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UberKafkaConsumer {

    private final UberRideRepository uberRideRepository;
    private final UberKafkaProducer kafkaProducer;

    @KafkaListener(topics = "R2U", groupId = "uber-group")
    public void consumeRideRequest(RideRequest request) {
        System.out.println("Received ride request: " + request);

       
        UberRideEntity entity = new UberRideEntity(
                request.getRideId(),
                request.getRiderName(),
                request.getPickupLocation(),
                request.getDropLocation(),
                "accepted",
                "DriverXYZ",
                "5 mins"
        );
        uberRideRepository.save(entity);

       
        RideResponse response = new RideResponse(
                request.getRideId(),
                "accepted",
                "DriverXYZ",
                "5 mins"
        );
        kafkaProducer.sendRideResponse(response);


    }
}

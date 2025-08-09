package com.example.riderservice.kafka;

import com.example.riderservice.model.RideResponse;
import com.example.riderservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiderKafkaConsumer {

    private final RideRequestRepository rideRequestRepository;

    @KafkaListener(topics = "U2R", groupId = "rider-group")
    public void consumeRideResponse(RideResponse response) {
        System.out.println("Received ride response from topic U2R: " + response);

        rideRequestRepository.findById(response.getRideId()).ifPresent(ride -> {
            ride.setStatus(response.getStatus());
            rideRequestRepository.save(ride);
            System.out.println("Updated ride status in DB: " + ride);
        });
    }
}

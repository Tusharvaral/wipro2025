package com.example.riderservice.controller;

import com.example.riderservice.kafka.RiderKafkaProducer;
import com.example.riderservice.model.RideRequest;
import com.example.riderservice.model.entity.RideRequestEntity;
import com.example.riderservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ride")
@RequiredArgsConstructor
public class RiderController {

    private final RiderKafkaProducer kafkaProducer;
    private final RideRequestRepository rideRequestRepository;

    @PostMapping
    public ResponseEntity<String> bookRide(@RequestBody RideRequest request) {
        RideRequestEntity entity = new RideRequestEntity(
                request.getRideId(),
                request.getRiderName(),
                request.getPickupLocation(),
                request.getDropLocation(),
                "pending"
        );
        rideRequestRepository.save(entity);
        kafkaProducer.sendRideRequest(request);
        return ResponseEntity.ok("Ride request sent successfully!");
    }
}

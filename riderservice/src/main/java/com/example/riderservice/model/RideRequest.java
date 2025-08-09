package com.example.riderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequest {
    private String rideId;
    private String riderName;
    private String pickupLocation;
    private String dropLocation;
}

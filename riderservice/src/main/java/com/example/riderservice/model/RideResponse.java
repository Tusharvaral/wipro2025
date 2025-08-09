package com.example.riderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideResponse {
    private String rideId;
    private String status;  
    private String driverName;
    private String eta;
}

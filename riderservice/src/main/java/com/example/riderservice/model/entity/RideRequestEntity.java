package com.example.riderservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ride_requests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestEntity {

    @Id
    private String rideId;
    private String riderName;
    private String pickupLocation;
    private String dropLocation;
    private String status;  
}

package com.example.uberservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uber_ride")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UberRideEntity {

    @Id
    private String rideId;
    private String riderName;
    private String pickupLocation;
    private String dropLocation;
    private String status;   // accepted, completed
    private String driverName;
    private String eta;
}

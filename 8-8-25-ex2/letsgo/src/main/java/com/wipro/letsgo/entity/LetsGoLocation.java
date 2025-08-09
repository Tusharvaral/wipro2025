package com.wipro.letsgo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicle-movement")
@Data
public class LetsGoLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Column(name = "vehicle_id")
    int vehId;
    
    @Column(name = "latitude")
    double latitude;

    @Column(name = "longitude")
    private double longitude;
}

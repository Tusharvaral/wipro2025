package com.example.riderservice.repository;

import com.example.riderservice.model.entity.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequestEntity, String> {
}

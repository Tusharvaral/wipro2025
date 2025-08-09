package com.example.uberservice.repository;

import com.example.uberservice.model.entity.UberRideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UberRideRepository extends JpaRepository<UberRideEntity, String> {
}

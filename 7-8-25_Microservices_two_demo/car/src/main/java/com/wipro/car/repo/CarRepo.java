package com.wipro.car.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.car.entity.Car;

public interface CarRepo extends JpaRepository<Car, Long> {

}

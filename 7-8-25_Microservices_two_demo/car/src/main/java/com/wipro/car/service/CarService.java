package com.wipro.car.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.car.entity.Car;

@Service
public interface CarService {
	Car saveCar(Car car);
    List<Car> getAllCars();
    Optional<Car> getCarById(Long id);
    Car updateCar(Long id, Car carDetails);
    void deleteCar(Long id);
}

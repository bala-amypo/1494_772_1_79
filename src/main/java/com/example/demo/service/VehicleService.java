package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import jakarta.validation.Valid;

import java.util.List;

public interface VehicleService {

    Vehicle addVehicle(Long userId, @Valid Vehicle vehicle);

    List<Vehicle> getVehiclesByUser(Long userId);

   
    Vehicle findById(Long id);

    Vehicle findByVehicleNumber(String vehicleNumber);
}
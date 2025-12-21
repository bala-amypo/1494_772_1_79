package com.example.demo.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ShipmentEntity;
import com.example.demo.entity.VehicleEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final VehicleRepository vehicleRepository;

    // ✅ Constructor Injection (MANDATORY)
    public ShipmentServiceImpl(ShipmentRepository shipmentRepository,
                               VehicleRepository vehicleRepository) {
        this.shipmentRepository = shipmentRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public ShipmentEntity createShipment(ShipmentEntity shipment) {

        // ✅ Fetch vehicle or throw ResourceNotFoundException
        VehicleEntity vehicle = vehicleRepository.findById(
                shipment.getVehicle().getId()
        ).orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        // ✅ Weight validation (keyword MUST contain "exceeds")
        if (shipment.getWeightKg() > vehicle.getCapacityKg()) {
            throw new IllegalArgumentException("Weight exceeds vehicle capacity");
        }

        // ✅ Scheduled date validation (keyword MUST contain "past")
        if (shipment.getScheduledDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date cannot be in the past");
        }

        shipment.setVehicle(vehicle);
        return shipmentRepository.save(shipment);
    }
}

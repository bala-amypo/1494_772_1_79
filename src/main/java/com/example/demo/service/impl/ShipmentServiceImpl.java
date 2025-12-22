package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ShipmentEntity;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public ShipmentEntity createShipment(ShipmentEntity shipment) {

        if (shipment.getWeightKg() <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }

        return shipmentRepository.save(shipment);
    }
}
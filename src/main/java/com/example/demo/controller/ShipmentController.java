


package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ShipmentEntity;
import com.example.demo.service.ShipmentService;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping
    public ShipmentEntity createShipment(@RequestBody ShipmentEntity shipment) {
        return shipmentService.createShipment(shipment);
    }
}


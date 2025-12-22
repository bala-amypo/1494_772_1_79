


package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VehicleEntity;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public VehicleEntity addVehicle(@RequestBody VehicleEntity vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping
    public List<VehicleEntity> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}

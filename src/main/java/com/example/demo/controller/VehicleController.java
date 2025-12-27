package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@Validated  
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service){
        this.service = service;
    }

    @PostMapping("/{userId}")
    public Vehicle add(@PathVariable Long userId, @Valid @RequestBody Vehicle v){
        return service.addVehicle(userId, v);
    }

    @GetMapping("/user/{userId}")
    public List<Vehicle> getByUser(@PathVariable Long userId){
        return service.getVehiclesByUser(userId);
    }
}
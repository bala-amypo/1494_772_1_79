package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/optimize")
public class RouteOptimizationController {

    @PostMapping("/{shipmentId}")
    public String optimizeRoute(@PathVariable Long shipmentId) {
        return "Route optimized for shipment " + shipmentId;
    }
}

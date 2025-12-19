package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vehicleNumber;
    private Double capacityKg;

    public VehicleEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Double getCapacityKg() {
        return capacityKg;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setCapacityKg(Double capacityKg) {
        this.capacityKg = capacityKg;
    }
}

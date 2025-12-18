package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RouteOptimizationResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ShipmentEntity shipment;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsage;

    public RouteOptimizationResultEntity() {
    }

    public Long getId() {
        return id;
    }

    public ShipmentEntity getShipment() {
        return shipment;
    }

    public void setShipment(ShipmentEntity shipment) {
        this.shipment = shipment;
    }
}

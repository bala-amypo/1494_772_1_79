package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class ShipmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double weightKg;
    private LocalDate scheduledDate;

    @ManyToOne
    private VehicleEntity vehicle;

    @ManyToOne
    private LocationEntity pickupLocation;

    @ManyToOne
    private LocationEntity dropLocation;

    public ShipmentEntity() {
    }

    public Long getId() { return id; }
    public Double getWeightKg() { return weightKg; }
    public LocalDate getScheduledDate() { return scheduledDate; }
    public VehicleEntity getVehicle() { return vehicle; }
    public LocationEntity getPickupLocation() { return pickupLocation; }
    public LocationEntity getDropLocation() { return dropLocation; }

    public void setId(Long id) { this.id = id; }
    public void setWeightKg(Double weightKg) { this.weightKg = weightKg; }
    public void setScheduledDate(LocalDate scheduledDate) { this.scheduledDate = scheduledDate; }
    public void setVehicle(VehicleEntity vehicle) { this.vehicle = vehicle; }
    public void setPickupLocation(LocationEntity pickupLocation) { this.pickupLocation = pickupLocation; }
    public void setDropLocation(LocationEntity dropLocation) { this.dropLocation = dropLocation; }
}

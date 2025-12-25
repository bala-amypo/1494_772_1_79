package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.demo.entity.*;
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    List<Shipment> findByVehicleId(Long vehicleId);
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ShipmentEntity;

public interface ShipmentRepository extends JpaRepository<ShipmentEntity, Long> {
}

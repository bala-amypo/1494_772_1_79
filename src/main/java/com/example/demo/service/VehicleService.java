package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.VehicleEntity;

public interface VehicleService {

    VehicleEntity addVehicle(VehicleEntity vehicle);

    List<VehicleEntity> getAllVehicles();
}

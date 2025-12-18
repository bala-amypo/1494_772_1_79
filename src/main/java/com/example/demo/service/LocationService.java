





package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.LocationEntity;

public interface LocationService {

    LocationEntity createlocation(LocationEntity le);

    List<LocationEntity> getAllLocations();
}
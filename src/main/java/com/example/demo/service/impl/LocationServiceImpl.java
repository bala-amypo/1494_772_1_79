package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    // ✅ Constructor Injection (REQUIRED by test)
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public LocationEntity createlocation(LocationEntity le) {

        // ✅ Latitude validation (keyword MUST contain "latitude")
        if (le.getLatitude() == null || le.getLatitude() > 90 || le.getLatitude() < -90) {
            throw new IllegalArgumentException("Invalid latitude value");
        }

        // (Optional but safe) Longitude validation
        if (le.getLongitude() == null || le.getLongitude() > 180 || le.getLongitude() < -180) {
            throw new IllegalArgumentException("Invalid longitude value");
        }

        return locationRepository.save(le);
    }

    @Override
    public List<LocationEntity> getAllLocations() {
        return locationRepository.findAll();
    }
}

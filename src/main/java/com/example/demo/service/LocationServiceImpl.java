


package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public LocationEntity createlocation(LocationEntity le) {
        return locationRepository.save(le);
    }

    @Override
    public List<LocationEntity> getAllLocations() {
        return locationRepository.findAll();
    }
}


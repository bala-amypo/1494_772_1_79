package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/addlocation")
    public LocationEntity add(@RequestBody LocationEntity le) {
        return locationService.createlocation(le); // matches service
    }

    @GetMapping("/showlocation")
    public List<LocationEntity> show() {
        return locationService.getAllLocations(); // matches service
    }
}

Route Optimizarion controller


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


Shipment controller


package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ShipmentEntity;
import com.example.demo.service.ShipmentService;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping
    public ShipmentEntity createShipment(@RequestBody ShipmentEntity shipment) {
        return shipmentService.createShipment(shipment);
    }
}

User controller


package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}


Vehicle controller


package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.VehicleEntity;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public VehicleEntity addVehicle(@RequestBody VehicleEntity vehicle) {
        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping
    public List<VehicleEntity> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }
}

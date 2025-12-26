package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name="vehicles",uniqueConstraints=@UniqueConstraint(columnNames="vehicleNumber"))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    @NotNull(message = "User cannot be null")
    private User user;

    @Column(unique=true)
    @NotBlank(message = "Vehicle number cannot be blank")
    private String vehicleNumber;

    @NotNull(message = "Capacity cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Capacity must be greater than 0")
    private Double capacityKg;

    @DecimalMin(value = "0.0", inclusive = false, message = "Fuel efficiency must be greater than 0")
    private Double fuelEfficiency;
}
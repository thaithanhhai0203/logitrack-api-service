package com.logitrack.vehicle.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehicles")
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(nullable = false, length = 200)
    private String location;

    @Column(nullable = false, length = 100)
    private String fuel;

    @Column(name = "eta_return", nullable = false, length = 200)
    private String etaReturn;

    @Column(nullable = false)
    private Double capacity;

    @Column(name = "driver_id", nullable = false)
    private Long driverId;

    @Column(name = "inserted_datetime", nullable = false, updatable = false)
    private LocalDateTime insertedDatetime;

    @Column(name = "updated_datetime")
    private LocalDateTime updatedDatetime;

    @PrePersist
    protected void onCreate() {
        insertedDatetime = LocalDateTime.now();
        updatedDatetime = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedDatetime = LocalDateTime.now();
    }
}

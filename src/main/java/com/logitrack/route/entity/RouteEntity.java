package com.logitrack.route.entity;

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
@Table(name = "routes")
public class RouteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "driver_id", nullable = false)
    private Long driverId;

    @Column(nullable = false, length = 50)
    private String longitude;

    @Column(nullable = false, length = 50)
    private String latitude;

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

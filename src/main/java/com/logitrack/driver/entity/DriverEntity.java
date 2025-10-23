package com.logitrack.driver.entity;

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
@Table(name = "drivers")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String avatar;

    @Column(nullable = false, length = 50)
    private String status;

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

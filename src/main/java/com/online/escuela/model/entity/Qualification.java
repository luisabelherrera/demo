package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QUALIFICATION")
public class Qualification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idQualification;

    @DecimalMin(value = "0.0", message = "Grade must be at least 0.0")
    @DecimalMax(value = "10.0", message = "Grade must be at most 10.0")
    @NotNull(message = "Grade cannot be null")
    @Column(nullable = false)
    private Double grade;

    @NotNull(message = "Asset status cannot be null")
    @Column(nullable = false)
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "RegistrationDate", nullable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();
}

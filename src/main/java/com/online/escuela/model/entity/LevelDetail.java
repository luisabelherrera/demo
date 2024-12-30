package com.online.escuela.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LEVEL_DETAIL")
public class LevelDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long levelDetailId;

    @Min(value = 0, message = "Total vacancies must be at least 0")
    @Column(nullable = false)
    private int totalVacancies;

    @Min(value = 0, message = "Available vacancies must be at least 0")
    private int availableVacancies;

    @Min(value = 0, message = "Occupied vacancies must be at least 0")
    private int occupiedVacancies;

    @NotNull(message = "Active status cannot be null")
    private boolean isActive = true;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "RegistrationDate", nullable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();

    
}

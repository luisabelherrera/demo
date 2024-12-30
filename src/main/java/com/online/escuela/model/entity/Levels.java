package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@Table(name = "LEVELS")
public class Levels implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLevels;

    @NotEmpty(message = "Level description cannot be empty")
    @Size(min = 3, max = 50, message = "Level description must be between 3 and 50 characters")
    @Column(nullable = false)
    private String levelDescription;

    @NotEmpty(message = "Shift description cannot be empty")
    @Size(min = 3, max = 50, message = "Shift description must be between 3 and 50 characters")
    @Column(nullable = false)
    private String shiftDescription;

    @NotEmpty(message = "Start time cannot be empty")
    @Column(nullable = false)
    private String startTime;

    @NotEmpty(message = "End time cannot be empty")
    @Column(nullable = false)
    private String endTime;

    @NotNull(message = "Asset status cannot be null")
    @Column(nullable = false)
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "RegistrationDate", nullable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();
}

package com.online.escuela.model.entity.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LevelDetailDTO {

    private long levelDetailId;

    @Min(value = 0, message = "Total vacancies must be at least 0")
    private int totalVacancies;

    @Min(value = 0, message = "Available vacancies must be at least 0")
    private int availableVacancies;

    @Min(value = 0, message = "Occupied vacancies must be at least 0")
    private int occupiedVacancies;

    @NotNull(message = "Active status cannot be null")
    private boolean isActive;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}

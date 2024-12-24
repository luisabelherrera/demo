package com.online.escuela.model.entity.dto;


import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
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
public class QualificationDTO {

    private long idQualification;

    @DecimalMin(value = "0.0", message = "Grade must be at least 0.0")
    @DecimalMax(value = "10.0", message = "Grade must be at most 10.0")
    @NotNull(message = "Grade cannot be null")
    private Double grade;

    @NotNull(message = "Asset status cannot be null")
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}

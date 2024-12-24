package com.online.escuela.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DegreesSectionsDTO {

    private int gradeSectionId;

    @NotEmpty(message = "Grade description cannot be empty")
    @Size(min = 3, max = 50, message = "Grade description must be between 3 and 50 characters")
    private String gradeDescription;

    @NotEmpty(message = "Section description cannot be empty")
    @Size(min = 3, max = 50, message = "Section description must be between 3 and 50 characters")
    private String sectionDescription;

    @NotNull(message = "Active status cannot be null")
    private boolean isActive;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}
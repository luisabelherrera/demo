package com.online.escuela.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
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
public class CurricularDTO {

    private int curricularId;

    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 3, max = 50, message = "Description must be between 3 and 50 characters")
    private String description;

    private boolean isActive;

    private LocalDateTime registrationDate;
}

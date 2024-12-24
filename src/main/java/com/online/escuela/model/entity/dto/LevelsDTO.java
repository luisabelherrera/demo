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
public class LevelsDTO {

    private long idLevels;

    @NotEmpty(message = "Level description cannot be empty")
    @Size(min = 3, max = 50, message = "Level description must be between 3 and 50 characters")
    private String levelDescription;

    @NotEmpty(message = "Shift description cannot be empty")
    @Size(min = 3, max = 50, message = "Shift description must be between 3 and 50 characters")
    private String shiftDescription;

    @NotEmpty(message = "Start time cannot be empty")
    private String startTime;

    @NotEmpty(message = "End time cannot be empty")
    private String endTime;

    @NotNull(message = "Asset status cannot be null")
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}
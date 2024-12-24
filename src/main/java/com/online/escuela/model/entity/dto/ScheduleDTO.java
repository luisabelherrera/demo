package com.online.escuela.model.entity.dto;

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
public class ScheduleDTO {

    private long idSchedule;

    @NotNull(message = "Asset status cannot be null")
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}
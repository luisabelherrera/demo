package com.online.escuela.model.entity.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TuitionDTO implements Serializable {

    private long idTuition;

    @NotNull(message = "Value code cannot be null")
    @Column(name = "value_code", nullable = false)
    private long valueCode;

    @NotNull(message = "Code cannot be null")
    @Column(name = "code", length = 50, nullable = false)
    private String code;

    @NotNull(message = "Status cannot be null")
    @Column(name = "status", length = 50, nullable = false)
    private String status;

    @NotNull(message = "Student ID cannot be null")
    @Column(name = "student_id", nullable = false)
    private long studentId;

    @NotNull(message = "Level detail ID cannot be null")
    @Column(name = "level_detail_id", nullable = false)
    private long levelDetailId;

    @NotNull(message = "Guardian ID cannot be null")
    @Column(name = "guardian_id", nullable = false)
    private long guardianId;

    @Column(name = "origin_institution", length = 50)
    private String originInstitution;

    @NotNull(message = "Repeater status cannot be null")
    @Column(name = "is_repeater", nullable = false)
    private boolean isRepeater;

    @NotNull(message = "Active status cannot be null")
    @Column(name = "active", nullable = false)
    private boolean active;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "registration_date", nullable = false)
    private ZonedDateTime registrationDate;
}

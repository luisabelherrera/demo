package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
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
@Table(name = "SCHEDULE")
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSchedule;

    @NotNull(message = "Course level detail ID cannot be null")
    @Column(name = "nivel_detalle_curso_id", nullable = false)
    private long courseLevelDetailId;

    @NotNull(message = "Day of the week cannot be null")
    @Column(name = "dia_semana", length = 50, nullable = false)
    private String dayOfWeek;

    @NotNull(message = "Start time cannot be null")
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime startTime;

    @NotNull(message = "End time cannot be null")
    @Column(name = "hora_fin", nullable = false)
    private LocalTime endTime;

    @NotNull(message = "Active status cannot be null")
    @Column(name = "activo", nullable = false)
    private boolean active;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "fecha_registro", nullable = false)
    private ZonedDateTime registrationDate;
}
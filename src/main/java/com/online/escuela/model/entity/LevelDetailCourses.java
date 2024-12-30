package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "LEVELDETAILCOURSES")
public class LevelDetailCourses implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long levelDetailCoursesId;

    @NotNull(message = "Asset status cannot be null")
    @Column(nullable = false)
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "RegistrationDate", nullable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();
}

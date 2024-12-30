package com.online.escuela.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DEGREESSECTIONS")
public class DegreesSections implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeSectionId;

    @NotEmpty(message = "Grade description cannot be empty")
    @Size(min = 3, max = 50, message = "Grade description must be between 3 and 50 characters")
    @Column(nullable = false)
    private String gradeDescription;

    @NotEmpty(message = "Section description cannot be empty")
    @Size(min = 3, max = 50, message = "Section description must be between 3 and 50 characters")
    @Column(nullable = false)
    private String sectionDescription;

    @NotNull(message = "Active status cannot be null")
    @Column(nullable = false)
    private boolean isActive = true;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "RegistrationDate", nullable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();
}

package com.online.escuela.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CURRICULAR")
public class Curricular implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int curricularId;


    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 3, max = 50, message = "Description must be between 3 and 50 characters")
    @Column(nullable = false)
    private String description;

    private boolean isActive = true;

    @Column(name = "RegistrationDate")
    private LocalDateTime registrationDate = LocalDateTime.now();
}
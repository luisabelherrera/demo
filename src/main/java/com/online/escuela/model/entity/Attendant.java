package com.online.escuela.model.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ATTENDANT")
public class Attendant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long attendantId;

    @NotEmpty(message = "Relationship cannot be empty")
    @Size(min = 2, max = 20, message = "Relationship size must be between 2 and 20 characters")
    private String relationship;

    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 4, max = 12, message = "First name size must be between 4 and 12 characters")
    @Column(nullable = false)
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Size(min = 4, max = 12, message = "Last name size must be between 4 and 12 characters")
    @Column(nullable = false)
    private String lastName;

    @NotEmpty(message = "Identity document cannot be empty")
    @Size(min = 6, max = 20, message = "Identity document size must be between 6 and 20 characters")
    @Column(nullable = false)
    private String identityDocument;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Gender cannot be empty")
    @Size(min = 4, max = 10, message = "Gender size must be between 4 and 10 characters")
    private String gender;

    @NotEmpty(message = "Marital status cannot be empty")
    @Size(min = 4, max = 15, message = "Marital status size must be between 4 and 15 characters")
    private String maritalStatus;

    @NotEmpty(message = "City cannot be empty")
    @Size(min = 2, max = 30, message = "City size must be between 2 and 30 characters")
    private String city;

    @NotEmpty(message = "Address cannot be empty")
    @Size(min = 5, max = 50, message = "Address size must be between 5 and 50 characters")
    private String address;

    private boolean isActive = true;

    @Column(name = "RegistrationDate")
    private LocalDateTime registrationDate = LocalDateTime.now();
}

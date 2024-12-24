package com.online.escuela.model.entity.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {

    private long studentId;

    @NotNull(message = "Code value cannot be null")
    private int codeValue;

    @NotEmpty(message = "Code cannot be empty")
    @Size(min = 4, max = 12, message = "Code size must be between 4 and 12 characters")
    private String code;

    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 2, max = 30, message = "First name size must be between 2 and 30 characters")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Size(min = 2, max = 30, message = "Last name size must be between 2 and 30 characters")
    private String lastName;

    @NotEmpty(message = "Identity document cannot be empty")
    @Size(min = 6, max = 20, message = "Identity document size must be between 6 and 20 characters")
    private String identityDocument;

    @Past(message = "Date of birth must be in the past")
    @NotNull(message = "Date of birth cannot be null")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Gender cannot be empty")
    @Size(min = 4, max = 10, message = "Gender size must be between 4 and 10 characters")
    private String gender;

    @NotEmpty(message = "City cannot be empty")
    @Size(min = 2, max = 30, message = "City size must be between 2 and 30 characters")
    private String city;

    @NotEmpty(message = "Address cannot be empty")
    @Size(min = 5, max = 50, message = "Address size must be between 5 and 50 characters")
    private String address;

    @NotNull(message = "Active status cannot be null")
    private boolean isActive;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}

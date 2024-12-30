package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

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
@Table(name = "TEACHING")
public class Teaching implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeaching;

    @NotNull(message = "Code cannot be null")
    @Column(name = "codigo", length = 50, nullable = false)
    private String code;

    @NotNull(message = "Identity document cannot be null")
    @Column(name = "documento_identidad", length = 100, nullable = false)
    private String identityDocument;

    @NotNull(message = "First name cannot be null")
    @Column(name = "nombres", length = 100, nullable = false)
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Column(name = "apellidos", length = 100, nullable = false)
    private String lastName;

    @NotNull(message = "Birthdate cannot be null")
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date birthDate;

    @NotNull(message = "Gender cannot be null")
    @Column(name = "sexo", length = 50, nullable = false)
    private String gender;

    @NotNull(message = "Study grade cannot be null")
    @Column(name = "grado_estudio", length = 100, nullable = false)
    private String studyGrade;

    @NotNull(message = "City cannot be null")
    @Column(name = "ciudad", length = 100, nullable = false)
    private String city;

    @NotNull(message = "Address cannot be null")
    @Column(name = "direccion", length = 100, nullable = false)
    private String address;

    @NotNull(message = "Email cannot be null")
    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @NotNull(message = "Phone number cannot be null")
    @Column(name = "numero_telefono", length = 50, nullable = false)
    private String phoneNumber;

    @NotNull(message = "Active status cannot be null")
    @Column(name = "activo", nullable = false)
    private boolean active;

    @NotNull(message = "Registration date cannot be null")
    @Column(name = "fecha_registro", nullable = false)
    private ZonedDateTime registrationDate;
}
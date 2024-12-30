package com.online.escuela.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;
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
@Table(name = "TEACHER_LEVEL_DETAIL_COURSE")
public class TeacherLevelDetailCourse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTeacherLevelDetailCourse;

    @Column(nullable = false)
    private boolean asset;

    @Column(name = "RegistrationDate", nullable = false, updatable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();


}

package com.online.escuela.model.entity.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherLevelDetailCourseDTO implements Serializable {

    private long idTeacherLevelDetailCourse;

    @NotNull(message = "Asset status cannot be null")
    private boolean asset;

    @NotNull(message = "Registration date cannot be null")
    private LocalDateTime registrationDate;
}

package com.online.escuela.services.entityServices.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.online.escuela.model.entity.Courses;
import com.online.escuela.model.entity.dto.CoursesDTO;
import com.online.escuela.repositories.jpa.CoursesRepositories;
import com.online.escuela.services.entityServices.CoursesService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepositories coursesRepositories;

    @Override
    public List<CoursesDTO> findAll() {
        return coursesRepositories.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CoursesDTO> findById(Long id) {
        return coursesRepositories.findById(id)
                .map(this::convertToDTO);
    }

    @Override
    public CoursesDTO save(CoursesDTO coursesDTO) {
        coursesDTO.setRegistrationDate(LocalDateTime.now());
        Courses courses = convertToEntity(coursesDTO);
        return convertToDTO(coursesRepositories.save(courses));
    }

    @Override
    public void deleteById(Long id) {
        coursesRepositories.deleteById(id);
    }

    private CoursesDTO convertToDTO(Courses courses) {
        return CoursesDTO.builder()
                .courseId(courses.getCourseId())
                .description(courses.getDescription())
                .isActive(courses.isActive())
                .registrationDate(courses.getRegistrationDate())
                .build();
    }

    private Courses convertToEntity(CoursesDTO coursesDTO) {
        return Courses.builder()
                .courseId(coursesDTO.getCourseId())
                .description(coursesDTO.getDescription())
                .isActive(coursesDTO.isActive())
                .registrationDate(coursesDTO.getRegistrationDate())
                .build();
    }
}

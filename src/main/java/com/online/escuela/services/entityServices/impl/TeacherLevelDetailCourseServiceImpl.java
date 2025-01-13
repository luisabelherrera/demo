package com.online.escuela.services.entityServices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.dto.TeacherLevelDetailCourseDTO;
import com.online.escuela.services.entityServices.TeacherLevelDetailCourseService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherLevelDetailCourseServiceImpl implements TeacherLevelDetailCourseService{@Override
    public List<TeacherLevelDetailCourseDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public TeacherLevelDetailCourseDTO save(TeacherLevelDetailCourseDTO teacherLevelDetailCourse) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<TeacherLevelDetailCourseDTO> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

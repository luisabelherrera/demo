package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.StudentDTO;

public interface StudentService {

    List<StudentDTO> findAll();

    Optional<StudentDTO> findById(Long id);

    StudentDTO save(StudentDTO studentDTO);

    void deleteById(Long id);
}

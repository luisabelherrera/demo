package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.CoursesDTO;

public interface CoursesService {

    List<CoursesDTO> findAll();
  Optional<CoursesDTO> findById(Long id);
  CoursesDTO save(CoursesDTO  coursesDTO);
  void deleteById(Long id);

}

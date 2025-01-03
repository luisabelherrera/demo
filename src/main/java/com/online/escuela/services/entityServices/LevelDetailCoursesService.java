package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.LevelDetailCoursesDTO;

public interface LevelDetailCoursesService {

    List<LevelDetailCoursesDTO> findAll();

    Optional<LevelDetailCoursesDTO> findById(Long id);

    LevelDetailCoursesDTO save(LevelDetailCoursesDTO LevelDetailCoursesDTO);

    void deleteById(long id);
}

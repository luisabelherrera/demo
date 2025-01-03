package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.TeachingDTO;

public interface TeachingService {

    List<TeachingDTO> findAll();

    Optional<TeachingDTO> findById(Long id);

    TeachingDTO save(TeachingDTO teachingDTO);

    void deleteById(Long id);

}

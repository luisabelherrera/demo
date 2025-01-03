package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.LevelDetailDTO;

public interface LevelDetailService {

    List<LevelDetailDTO> findAll();

    Optional<LevelDetailDTO> findById(Long id);

    LevelDetailDTO save(LevelDetailDTO levelDetailDTO);

    void deleteById(Long id);

}

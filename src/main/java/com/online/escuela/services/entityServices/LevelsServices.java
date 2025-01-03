package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.LevelsDTO;

public interface LevelsServices {

    List<LevelsDTO> findAll();

    Optional<LevelsDTO> findById(Long id);

    LevelsDTO save(LevelsDTO levelsDTO);

    void deleteById(Long id);
    

}

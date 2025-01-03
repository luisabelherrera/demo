package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.PeriodsDTO;

public interface PeriodsService {

    List<PeriodsDTO> findAll();

    PeriodsDTO save(PeriodsDTO periodsDTO);

    Optional<PeriodsDTO> findById(Long id);

    void deleteById(Long id);

}

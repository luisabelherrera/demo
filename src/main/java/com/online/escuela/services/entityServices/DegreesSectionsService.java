package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.DegreesSectionsDTO;

public interface DegreesSectionsService {

    List<DegreesSectionsDTO> findAll();

    Optional<DegreesSectionsDTO> findById(Long id);

    DegreesSectionsDTO save(DegreesSectionsDTO degreesSectionsDTO);

    void deleteById(long id);

}

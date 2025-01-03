package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.QualificationDTO;

public interface QualificationService {

    List<QualificationDTO> findAll();

    Optional<QualificationDTO> findById(Long id);

    QualificationDTO save(QualificationDTO qualificationDTO);

    void deleteById(Long id);

}

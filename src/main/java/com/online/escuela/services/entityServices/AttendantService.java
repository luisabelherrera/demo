package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.AttendantDTO;

public interface AttendantService {

    List<AttendantDTO> findAll();

    Optional<AttendantDTO> findById(long id);

    AttendantDTO save(AttendantDTO attendatDTO);

    void deleteById(long id);
}

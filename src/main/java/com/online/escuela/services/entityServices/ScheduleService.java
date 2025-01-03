package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.ScheduleDTO;

public interface ScheduleService {

    List<ScheduleDTO> findAll();

    Optional<ScheduleDTO> findById(Long id);

    ScheduleDTO save(ScheduleDTO scheduleDTO);

    void deleteById(Long id);

}

package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.TuitionDTO;

public interface TuitionService {

   List<TuitionDTO> findAll();

   Optional<TuitionDTO> findById(Long id);

   TuitionDTO save(TuitionDTO tuitionDTO);

   void deleteById(Long id);
   

}

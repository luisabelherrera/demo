package com.online.escuela.services.entityServices.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.Curricular;
import com.online.escuela.model.entity.dto.CurricularDTO;
import com.online.escuela.repositories.jpa.CurricularRepositories;
import com.online.escuela.services.entityServices.CurricularService;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor
public class CurricularServiceImpl implements CurricularService {


    private final  CurricularRepositories curricularRepositories;
    

    @Override
    public List<CurricularDTO> findAll() {
           return curricularRepositories.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CurricularDTO> findById(long id) {
        return curricularRepositories.findById(id)
        .map(this::convertToDTO);
    }

    @Override
    public CurricularDTO save(CurricularDTO curricularDTO) {
        curricularDTO.setRegistrationDate(LocalDateTime.now());
        Curricular curricular = convertToEntity(curricularDTO);
        return convertToDTO(curricularRepositories.save(curricular));
    }

    @Override
    public void deleteById(long id) {      
        curricularRepositories.deleteById(id);
    }

  private CurricularDTO convertToDTO(Curricular curricular) {
        return CurricularDTO.builder()
                .curricularId(curricular.getCurricularId())
                .description(curricular.getDescription())
                .isActive(curricular.isActive())
                .registrationDate(curricular.getRegistrationDate())
                .build();
    }

    private Curricular convertToEntity(CurricularDTO curricularDTO) {
        return Curricular.builder()
        .curricularId(curricularDTO.getCurricularId())
        .description(curricularDTO.getDescription())
        .isActive(curricularDTO.isActive())
        .registrationDate(curricularDTO.getRegistrationDate())
        .build();
    }

}

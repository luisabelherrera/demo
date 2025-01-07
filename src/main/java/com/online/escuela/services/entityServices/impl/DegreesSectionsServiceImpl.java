package com.online.escuela.services.entityServices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.dto.DegreesSectionsDTO;
import com.online.escuela.repositories.jpa.DegreesSectionsRepositories;
import com.online.escuela.services.entityServices.DegreesSectionsService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DegreesSectionsServiceImpl  implements DegreesSectionsService {
    
    private final DegreesSectionsRepositories degreesSectionsRepositories;
    
    @Override
    public List<DegreesSectionsDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<DegreesSectionsDTO> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public DegreesSectionsDTO save(DegreesSectionsDTO degreesSectionsDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

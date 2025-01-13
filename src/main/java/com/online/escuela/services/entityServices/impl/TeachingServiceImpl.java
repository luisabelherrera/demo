package com.online.escuela.services.entityServices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.dto.TeachingDTO;
import com.online.escuela.services.entityServices.TeachingService;

import lombok.RequiredArgsConstructor;





@Service
@RequiredArgsConstructor
public class TeachingServiceImpl  implements  TeachingService{@Override
    public List<TeachingDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<TeachingDTO> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public TeachingDTO save(TeachingDTO teachingDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

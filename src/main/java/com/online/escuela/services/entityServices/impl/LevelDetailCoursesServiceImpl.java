package com.online.escuela.services.entityServices.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.online.escuela.model.entity.dto.LevelDetailCoursesDTO;
import com.online.escuela.services.entityServices.LevelDetailCoursesService;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class LevelDetailCoursesServiceImpl  implements LevelDetailCoursesService {

    @Override
    public List<LevelDetailCoursesDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<LevelDetailCoursesDTO> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public LevelDetailCoursesDTO save(LevelDetailCoursesDTO LevelDetailCoursesDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

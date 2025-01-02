package com.online.escuela.services.entityServices;

import java.util.List;
import java.util.Optional;

import com.online.escuela.model.entity.dto.CurricularDTO;

public interface CurricularService {

    List<CurricularDTO> findAll();

    Optional<CurricularDTO> findById(long id);

    CurricularDTO save(CurricularDTO curricularDTO);

    void deleteById(long id);
}

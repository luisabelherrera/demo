package com.online.escuela.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.escuela.model.entity.Qualification;

@Repository
public interface QualificationRepositories extends JpaRepository<Qualification,Long>{

    
}

package com.online.escuela.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.escuela.model.entity.DegreesSections;

@Repository
public interface DegreesSectionsRepositories extends JpaRepository<DegreesSections,Long> {

    

}

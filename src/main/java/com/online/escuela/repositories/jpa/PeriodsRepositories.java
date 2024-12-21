package com.online.escuela.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.escuela.model.entity.Periods;

@Repository
public interface PeriodsRepositories extends JpaRepository<Periods,Long>{

}

package com.online.escuela.repositories.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.escuela.model.entity.Attendant;

public interface AttendantRepositories extends JpaRepository<Attendant,Long> {

    

}

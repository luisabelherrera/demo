package com.online.escuela.repositories.jpa.jpaLogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.escuela.model.entityLogin.UserEntity;

@Repository
public interface UserEntityRepositories  extends JpaRepository<UserEntity,Long>{

    
}

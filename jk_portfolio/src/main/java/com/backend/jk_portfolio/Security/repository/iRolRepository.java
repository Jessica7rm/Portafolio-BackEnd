package com.backend.jk_portfolio.Security.repository;

import com.backend.jk_portfolio.Security.entity.Rol;
import com.backend.jk_portfolio.Security.enums.RolNombre;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

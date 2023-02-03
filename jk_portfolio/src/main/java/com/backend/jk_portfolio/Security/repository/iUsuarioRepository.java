package com.backend.jk_portfolio.Security.repository;


import java.util.Optional;

import com.backend.jk_portfolio.Security.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}

package com.backend.jk_portfolio.Repository;

import com.backend.jk_portfolio.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}

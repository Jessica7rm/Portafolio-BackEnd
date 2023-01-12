
package com.backend.jk_portfolio.Repository;

import com.backend.jk_portfolio.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    
}


package com.backend.jk_portfolio.Service;

import com.backend.jk_portfolio.Entity.Proyecto;
import com.backend.jk_portfolio.Interface.IProyectoService;
import com.backend.jk_portfolio.Repository.ProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    ProyectoRepository rProyecto;

    @Override
    public void saveProyecto(Proyecto proyecto) {
      rProyecto.save(proyecto);
    }

    @Override
    public void deleteProyecto(int id) {
       rProyecto.deleteById(id);
    }

    @Override
    public List<Proyecto> traerProyectos() {
        List<Proyecto> proyectos = rProyecto.findAll();
        return proyectos;
    }

    @Override
    public Proyecto traerProyectoPorId(int id) {
       Proyecto pro = rProyecto.findById(id).orElse(null);
        return pro;
    }
    
    
}

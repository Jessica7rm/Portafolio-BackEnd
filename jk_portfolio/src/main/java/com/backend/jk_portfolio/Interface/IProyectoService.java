
package com.backend.jk_portfolio.Interface;

import com.backend.jk_portfolio.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(int id);

    public List<Proyecto> traerProyectos();

    public Proyecto traerProyectoPorId(int id);

}

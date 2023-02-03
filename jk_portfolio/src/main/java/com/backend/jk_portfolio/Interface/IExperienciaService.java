package com.backend.jk_portfolio.Interface;

import com.backend.jk_portfolio.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    public void saveExperiencia(Experiencia experiencia);
    public void deleteExperiencia(int id);
    public Experiencia findExperiencia(int id);
}

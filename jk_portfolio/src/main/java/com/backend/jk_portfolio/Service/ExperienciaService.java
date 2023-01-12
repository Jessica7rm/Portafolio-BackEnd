package com.backend.jk_portfolio.Service;

import com.backend.jk_portfolio.Entity.Experiencia;
import com.backend.jk_portfolio.Interface.IExperienciaService;
import com.backend.jk_portfolio.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    ExperienciaRepository rExperiencia;

    
     
    @Override
     public void saveExperiencia(Experiencia experiencia){
         rExperiencia.save(experiencia);
     }
     
    @Override
     public void deleteExperiencia(int id){
         rExperiencia.deleteById(id);
     }

    @Override
    public Experiencia findExperiencia(int id) {
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;

    }
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencias = rExperiencia.findAll();
        return experiencias;

   }
}

package com.backend.jk_portfolio.Service;

import com.backend.jk_portfolio.Entity.Educacion;
import com.backend.jk_portfolio.Interface.IEducacionService;
import com.backend.jk_portfolio.Repository.EducacionRepository;
import javax.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class EducacionService implements IEducacionService {
    
    @Autowired 
    EducacionRepository rEducacion;
    
    
    @Override
    public void deleteEducacion(int id) {
        rEducacion.deleteById(id);
    }

    @Override
    public Educacion findEducacion(int id) {
        Educacion edu = rEducacion.findById(id).orElse(null);
        return edu;
    }

    
    @Override
    public void saveEducacion(Educacion educacion) {

        rEducacion.save(educacion);

    }
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educaciones = rEducacion.findAll();
        return educaciones;
    }
}

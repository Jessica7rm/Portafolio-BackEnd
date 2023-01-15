package com.backend.jk_portfolio.Service;

import com.backend.jk_portfolio.Entity.Persona;
import com.backend.jk_portfolio.Interface.IPersonaService;
import java.util.List;
import org.springframework.stereotype.Service;
import com.backend.jk_portfolio.Repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{
    PersonaRepository rRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = rRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        rRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
       rRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = rRepository.findById(id).orElse(null);
        return persona;
    }
    
}

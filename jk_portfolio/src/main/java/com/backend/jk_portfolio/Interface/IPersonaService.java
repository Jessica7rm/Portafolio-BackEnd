package com.backend.jk_portfolio.Interface;

import com.backend.jk_portfolio.Entity.Persona;

public interface IPersonaService {

    public Persona traerPersona();
    public void savePersona(Persona persona);
    public void deletePersona(int id);
    public Persona editarPersona(Persona persona);

}

package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public void savePersona (Persona per);
    
    public void deletePersona (Long id);
    
    public List<Persona> getPersona ();
    
    public Persona searchPersona (Long id);
        
}

package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> getPer();
    
    public Persona searchPer (Long id);
    
    public void savePer (Persona per);
    
    public void deletePer (Long id);
    
}

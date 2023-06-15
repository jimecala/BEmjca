package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Persona;
import com.yoprogramo.be_mjca.repository.PersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> getPer() {
        return persoRepo.findAll();
    }
    
    @Override
    public Persona searchPer(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void savePer(Persona per) {
        persoRepo.save(per);
    }
    
    @Override
    public void deletePer(Long id) {
        persoRepo.deleteById(id);
    }
    
    

    
    

}
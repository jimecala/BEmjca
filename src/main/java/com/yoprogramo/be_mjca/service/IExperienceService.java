package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience> getExp();
    
    public Experience searchExp(Long id);
    
    public void saveExp(Experience exp);
    
    public void deleteExp(Long id);
      
    
    //public boolean existsById(Long id);
    
    //public boolean existsByEmployer(String employer);
    
    //public Optional<Experience> getByEmployer(String employer);
    
    
}

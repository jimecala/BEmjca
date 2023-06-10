package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Experience;
import com.yoprogramo.be_mjca.repository.ExperienceRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienceService implements IExperienceService{
    
    @Autowired
    public ExperienceRepository expRepo;
    
    @Override //list
    public List<Experience> getExp() {
        return expRepo.findAll();
    }
    
    @Override //getOne
    public Experience searchExp (Long id) {
        return expRepo.findById(id).orElse(null);
    }   

    @Override //save
    public void saveExp(Experience exp) {
        expRepo.save(exp);
    }

    @Override //delete
    public void deleteExp(Long id) {
        expRepo.deleteById(id);
    }
    
       
    /*

    @Override
    public boolean existsById(Long id) {
        return expRepo.existsById(id);
    }

    @Override
    public boolean existsByEmployer(String employer) {
        return expRepo.existsByEmployer(employer);
     }

    @Override
    public Optional<Experience> getByEmployer(String employer) {
         return expRepo.findByEmployer(employer);
     }*/
        
}

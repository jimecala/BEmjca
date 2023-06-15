package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Education;
import com.yoprogramo.be_mjca.repository.EducationRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService implements IEducationService{
    
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> getEdu() {
        return eduRepo.findAll();
    }

    @Override
    public Education searchEdu(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void saveEdu(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEdu(Long id) {
        eduRepo.deleteById(id);
    }
    

    
    
}

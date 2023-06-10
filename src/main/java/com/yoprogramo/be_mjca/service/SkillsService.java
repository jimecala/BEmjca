package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Skills;
import com.yoprogramo.be_mjca.repository.SkillsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository sklRepo;

    @Override
    public List<Skills> getSkills() {
        return sklRepo.findAll();
    }
    
    @Override
    public Skills searchSkl(Long id) {
        return sklRepo.findById(id).orElse(null);
    }
    
    @Override
    public void saveSkl(Skills skl) {
        sklRepo.save(skl);
    }

    @Override
    public void deleteSkl(Long id) {
        sklRepo.deleteById(id);
    }       
}
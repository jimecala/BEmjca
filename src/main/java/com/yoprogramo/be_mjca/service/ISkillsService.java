package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> getSkills();
    
    public Skills searchSkl(Long id);
    
    public void saveSkl(Skills skl);
    
    public void deleteSkl(Long id);
                
}

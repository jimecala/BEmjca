package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEdu();
    
    public Education searchEdu(Long id);
    
    public void saveEdu (Education edu);
    
    public void deleteEdu (Long id);
    
}

package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> showEducation ();
    
    public void newEducation (Education edu);
    
    public void deleteEducation (Long id);
    
}

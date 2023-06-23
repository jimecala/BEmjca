package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Projects;
import java.util.List;

public interface IProjectsService {
    
    public List<Projects> getProj();
    
    public Projects searchProj(Long id);
    
    public void saveProj(Projects proj);
    
    public void deleteProj(Long id);
    
}

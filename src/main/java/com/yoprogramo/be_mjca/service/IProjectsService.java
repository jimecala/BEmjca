package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Projects;
import java.util.List;


public interface IProjectsService {
    
    public List<Projects> showProjects ();
    
    public void addProject (Projects proj);
    
    public void deleteProject (Long id);
}

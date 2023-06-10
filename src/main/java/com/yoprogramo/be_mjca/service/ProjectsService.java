package com.yoprogramo.be_mjca.service;

import com.yoprogramo.be_mjca.model.Projects;
import com.yoprogramo.be_mjca.repository.ProjectsRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectsService implements IProjectsService{
    
    @Autowired
    public ProjectsRepository projRepo;

    @Override
    public List<Projects> showProjects () {
        return projRepo.findAll();
    }

    @Override
    public void addProject(Projects proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProject(Long id) {
        projRepo.deleteById(id);
    }
    
}

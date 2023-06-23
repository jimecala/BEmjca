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
    public List<Projects> getProj() {
        return projRepo.findAll();
    }
    
    @Override
    public Projects searchProj(Long id) {
        return projRepo.findById(id).orElse(null);
    }

    @Override
    public void saveProj(Projects proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProj(Long id) {
        projRepo.deleteById(id);
    }
    
}

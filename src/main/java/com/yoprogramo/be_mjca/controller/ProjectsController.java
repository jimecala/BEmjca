package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Projects;
import com.yoprogramo.be_mjca.service.IProjectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/projects")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProjectsController {
    @Autowired
    IProjectsService projServ;
    
    @GetMapping("/show/projects")
    @ResponseBody
    public List<Projects> showProjects (){
        return projServ.showProjects();
    }
    
    @PostMapping("/new/project")
    public void addProject (Projects proj){
        projServ.addProject(proj);
    }
    
    @DeleteMapping("/delete/project/{id}")
    public void deleteProject (Long id){
        projServ.deleteProject(id);
    }
    
}

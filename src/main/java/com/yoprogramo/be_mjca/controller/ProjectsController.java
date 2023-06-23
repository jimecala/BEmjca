package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Projects;
import com.yoprogramo.be_mjca.service.IProjectsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/projects")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProjectsController {
    @Autowired
    IProjectsService projServ;
    
    @GetMapping
    @ResponseBody
    public List<Projects> getProj (){
        return projServ.getProj();
    }
    
    @GetMapping("/{id}")
    public Projects searchProj(@PathVariable Long id){
        return projServ.searchProj(id);
    }    
    
    @PostMapping("/new")
    public void newProj (@RequestBody Projects proj){
        projServ.saveProj(proj);
    }
    
    @PutMapping ("/edit/{id}")
    public Projects editProj(@PathVariable Long id,
                   @RequestParam ("name") String newName,
                   @RequestParam ("description") String newDescription,
                   @RequestParam ("imgProject") String newImgProject){
        Projects proj = projServ.searchProj(id);
        
        proj.setName(newName);
        proj.setDescription(newDescription);
        proj.setImgProject(newImgProject);
        
        projServ.saveProj(proj);
        
        return proj;
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteProj (@PathVariable Long id){
        projServ.deleteProj(id);
    }
    
}

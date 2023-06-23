package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Education;
import com.yoprogramo.be_mjca.service.IEducationService;
import java.util.Date;
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
@RequestMapping(path = "/api/education")
@CrossOrigin(origins = "http://localhost:4200/")
public class EducationController {
    
    @Autowired
    IEducationService eduServ;
    
    @GetMapping
    @ResponseBody
    public List<Education> getEdu () {
        return eduServ.getEdu();
    }  
    
    @GetMapping("/{id}")
    public Education searchEdu(@PathVariable Long id){
        return eduServ.searchEdu(id);
    }
        
    @PostMapping ("/new")
    public void newEdu (@RequestBody Education edu) {
       eduServ.saveEdu(edu);
    }
    
    @PutMapping ("/edit/{id}")
    public Education editEdu(@PathVariable Long id,
                   @RequestParam ("institution") String newInstitution,
                   @RequestParam ("degree") String newDegree,
                   @RequestParam ("endDate") Date newEndDate){
        Education edu = eduServ.searchEdu(id);
        
        edu.setInstitution(newInstitution);
        edu.setDegree(newDegree);
        edu.setEndDate(newEndDate);
        
        eduServ.saveEdu(edu);
        
        return edu;
    }
        
    @DeleteMapping ("/delete/{id}")
    public void deleteEdu(@PathVariable Long id) {
        eduServ.deleteEdu(id);
    }
    
    
}

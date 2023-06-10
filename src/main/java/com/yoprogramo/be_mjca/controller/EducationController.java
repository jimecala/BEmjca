package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Education;
import com.yoprogramo.be_mjca.service.IEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/education")
@CrossOrigin(origins = "http://localhost:4200/")
public class EducationController {
    
    @Autowired
    IEducationService eduServ;
    
    @GetMapping ("/show/education")
    @ResponseBody
    public List<Education> showEducation () {
        return eduServ.showEducation();
    }  
        
    @PostMapping ("/new/education")
    public void addEducation (@RequestBody Education edu) {
       eduServ.newEducation(edu);
    }
        
    @DeleteMapping ("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id) {
        eduServ.deleteEducation(id);
    }
    
    
}

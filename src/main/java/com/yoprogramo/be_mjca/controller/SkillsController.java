package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Skills;
import com.yoprogramo.be_mjca.service.ISkillsService;
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
@RequestMapping(path = "/api/skills")
@CrossOrigin(origins = "http://localhost:4200/")
public class SkillsController {
    
    @Autowired
    ISkillsService sklServ;
    
    @GetMapping
    @ResponseBody
    public List<Skills> getSkills () {
        return sklServ.getSkills();
    }
    
    @GetMapping("/{id}")
    public Skills searchSkl(@PathVariable Long id){
        return sklServ.searchSkl(id);
    }
    
    @PostMapping ("/new")
    public void newSkl (@RequestBody Skills skl){
        sklServ.saveSkl(skl);
}
    
    @PutMapping ("/edit/{id}")
    public Skills editSkl(@PathVariable Long id,
                   @RequestParam ("name") String newName,
                   @RequestParam ("percentage") int newPercentage){
        Skills skl = sklServ.searchSkl(id);
        
        skl.setName(newName);
        skl.setPercentage(newPercentage);
        
        sklServ.saveSkl(skl);
        
        return skl;
    }
    
    @DeleteMapping ("/delete/{id}")
    public void deleteSkl (@PathVariable Long id){
        sklServ.deleteSkl(id);
    }
    
}

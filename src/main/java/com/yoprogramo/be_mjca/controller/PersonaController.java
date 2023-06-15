package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Persona;
import com.yoprogramo.be_mjca.service.IPersonaService;
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
@RequestMapping(path = "/api/persona")
@CrossOrigin(origins = "http://localhost:4200/")
public class PersonaController {
    
    @Autowired
    IPersonaService persoServ;
    
    @GetMapping
    @ResponseBody
    public List<Persona> getPer () {
        return persoServ.getPer();
    }
      
    @PostMapping ("/new")
    public void newPer (@RequestBody Persona per) {
       persoServ.savePer(per);
    }
    
    @PutMapping ("/edit/{id}")
    public Persona editPer(@PathVariable Long id,
                       @RequestParam("name") String newName,
                       @RequestParam("lastName") String newLastName,
                       @RequestParam("position") String newPosition,
                       @RequestParam("aboutMe") String newAboutMe,
                       @RequestParam("email") String newEmail,
                       @RequestParam("urlGithub") String newUrlGithub,
                       @RequestParam("urlLinkedin") String newUrlLinkedin,
                       @RequestParam("imgProfile") String newImgProfile,
                       @RequestParam("imgBanner") String newImgBanner){
        Persona per = persoServ.searchPer(id);
        
        per.setName(newName);
        per.setLastName(newLastName);
        per.setPosition(newPosition);
        per.setAboutMe(newAboutMe);
        per.setEmail(newEmail);
        per.setUrlGithub (newUrlGithub);
        per.setUrlLinkedin (newUrlLinkedin);
        per.setImgProfile(newImgProfile);
        per.setImgBanner(newImgBanner);
        
        persoServ.savePer(per);
        
        return per;
    }
        
    @DeleteMapping ("/delete/{id}")
    public void deletePer(@PathVariable Long id) {
        persoServ.deletePer(id);
    }
        
    
        
    
}

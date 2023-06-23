package com.yoprogramo.be_mjca.controller;

import com.yoprogramo.be_mjca.model.Experience;
import com.yoprogramo.be_mjca.service.IExperienceService;
import java.util.List;
import javax.transaction.Transactional;
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
@Transactional
@RequestMapping(path = "/api/experience")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    
    @Autowired
    IExperienceService expServ;
    
    @GetMapping
    @ResponseBody
    public List<Experience> getExp () {
        return expServ.getExp();
    }
    
    @GetMapping("/{id}")
    public Experience searchExp(@PathVariable Long id){
        return expServ.searchExp(id);
    }
    
    @PostMapping ("/new")
    public void newExp (@RequestBody Experience exp) {
       expServ.saveExp(exp);       
    }
    
    @PutMapping ("/edit/{id}")
    public Experience editExp(@PathVariable Long id,
                   @RequestParam ("position") String newPosition,
                   @RequestParam ("employer") String newEmployer){
        Experience exp = expServ.searchExp(id);
        
        exp.setPosition(newPosition);
        exp.setEmployer(newEmployer);
        
        expServ.saveExp(exp);
        
        return exp;
    }                 
      
    @DeleteMapping ("/delete/{id}")
    public void deleteExp (@PathVariable Long id){
        expServ.deleteExp(id);
    }
    
    /*@GetMapping("{id}")
    public Experience searchExp (Long id){
        return expServ.searchExp(id);
    }*/
    
    //GTP
    /*@PutMapping("/edit/{id}")
    public void editExp(@PathVariable("id") Long id, @RequestBody Experience exp) {
        expServ.searchExp(id);
        
        if (exp != null) {
            exp.setEmployer(exp.getEmployer());
            exp.setPosition(exp.getPosition());

            expServ.saveExp(exp);
        }
    }*/
    
    /*
    
    //Métodos MGB
    /*
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = sExperiencia.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    
    @PostMapping
    public ResponseEntity<?> newExperience(@RequestBody DtoExperience dtoexp){
        if (StringUtils.isBlank(dtoexp.getEmployer()))
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        if(ExperienceService.existsByEmployer(dtoexp.getEmployer()))
            return new ResponseEntity (new Mensaje("El campo ya existe"), HttpStatus.BAD_REQUEST);
        
        Experience exp = new Experience(dtoexp.getEmployer(), dtoexp.getPosition());
        expServ.saveExperience(exp);
        
        return new ResponseEntity(new Mensaje("Experiencia creada"), HttpStatus.OK);
    }*/
    
    /*@PutMapping("update/{id}")
    public ResponseEntity<?> editExperience(@PathVariable("id") int id, @RequestBody DtoExperience dtoexp){
        if(!expServ.existsById(id))
            return new ResponseEnity(new Mensaje("El ID no existe."), HttpStatus.BAD_REQUEST);
        if (expServ.existsByEmployer(dtoexp.getEmployer()) && expServ.getByEmployer(dtoexp.getEmployer()).get().getId() !=id)
            return new ResponseEntity(new Mensaje("La experiencia ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoexp.getEmployer()))
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experience exp = expServ.getOne(id).get();
        exp.setEmployer(dtoexp.getEmployer());
        exp.setPosition(dtoexp.getPosition());
        
        expServ.saveExperience(exp);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
        
    }*/
    
    /*@GetMapping ("/detail/{id}")
    public ResponseEntity<Experience> getById(@PathVariable("id") Long id){
        Experience exp = expServ.searchExp(id);
        return new ResponseEntity(exp, HttpStatus.OK);
    }*/
    
    /*@PutMapping("/edit/{id}")
    public ResponseEntity<?> edit(@PathVariable("id") Long id, @RequestBody DtoExperience dtoExp){
        //Validamos si existe el ID
        if(!expServ.existsById(id))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(expServ.existsByEmployer(dtoExp.getEmployer()) && expServ.getByEmployer(dtoExp.getEmployer()).get().getId() != id)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
               
        Experience exp = expServ.searchExp(id);
        exp.setEmployer(dtoExp.getEmployer());
        exp.setPosition((dtoExp.getPosition()));
        
        expServ.saveExp(exp);
        return new ResponseEntity(HttpStatus.OK);
             
    }*/
    
    //ESTE MÉTODO ***SÍ*** FUNCIONA EN POSTMAN
    /*@PutMapping("/edit/{id}")
    public ResponseEntity<Experience> editExp(@RequestBody Experience exp){
        ResponseEntity<Experience> response;
        if (exp.getId() != null && expServ.searchExp(exp.getId()) != null){
            response= ResponseEntity.ok(expServ.saveExp(exp));
        }else{
            response= ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }*/
    
}

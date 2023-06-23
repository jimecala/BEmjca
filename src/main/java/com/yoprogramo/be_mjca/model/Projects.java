package com.yoprogramo.be_mjca.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Projects implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String description;
    private String imgProject;

    public Projects() {
    }

    public Projects(Long id, String name, String description, String imgProject) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgProject = imgProject;
    }
    
    
}

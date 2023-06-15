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
public class Skills implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private Integer percentage;

    public Skills() {    }

    public Skills(Long id, String name, Integer percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    
    
}

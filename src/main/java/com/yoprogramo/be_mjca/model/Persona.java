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
public class Persona implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String lastName;
    private String position;
    private String aboutMe;
    private String email;
    private String urlGithub;
    private String urlLinkedin;
    private String imgProfile;
    private String imgBanner;

    public Persona() {    }

    public Persona(String name, String lastName, String position, String aboutMe, String email, String urlGithub, String urlLinkedin, String imgProfile, String imgBanner) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.aboutMe = aboutMe;
        this.email = email;
        this.urlGithub = urlGithub;
        this.urlLinkedin = urlLinkedin;
        this.imgProfile = imgProfile;
        this.imgBanner = imgBanner;
    }

    

    
}




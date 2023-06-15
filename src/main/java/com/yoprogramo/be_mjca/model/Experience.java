package com.yoprogramo.be_mjca.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experience implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String position;
    private String employer;   
        
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date startDate;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date endDate;

    public Experience() {
    }

    public Experience(String position, String employer, Date startDate, Date endDate) {
        this.position = position;
        this.employer = employer;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    

   
    
}

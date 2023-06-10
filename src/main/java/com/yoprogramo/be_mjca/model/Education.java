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
public class Education implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String institution;
    private String degree;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date startDate;
    
    @Temporal (javax.persistence.TemporalType.DATE)
    private Date endDate;

    public Education() {
    }

    public Education(String institution, String degree, Date startDate, Date endDate) {
        this.institution = institution;
        this.degree = degree;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
}

package com.yoprogramo.be_mjca.dto;

//import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoExperience {
    private String position;
    private String employer;
    /*private Date startDate;   
    private Date endDate;*/

    public DtoExperience() {
    }

    public DtoExperience(String position, String employer) {
        this.position = position;
        this.employer = employer;        
        /*this.startDate = startDate;
        this.endDate = endDate;*/
    }
    
    
    
}


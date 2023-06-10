package com.yoprogramo.be_mjca.repository;

import com.yoprogramo.be_mjca.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository <Education, Long>{
    
}

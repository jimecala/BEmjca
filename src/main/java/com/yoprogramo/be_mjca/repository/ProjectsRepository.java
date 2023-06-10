package com.yoprogramo.be_mjca.repository;

import com.yoprogramo.be_mjca.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Projects, Long>{
    
}

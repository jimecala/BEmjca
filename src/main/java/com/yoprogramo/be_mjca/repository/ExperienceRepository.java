package com.yoprogramo.be_mjca.repository;

import com.yoprogramo.be_mjca.model.Experience;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository <Experience, Long>{
    //public Optional<Experience> findByEmployer (String employer);
    //public boolean existsByEmployer(String employer);

}

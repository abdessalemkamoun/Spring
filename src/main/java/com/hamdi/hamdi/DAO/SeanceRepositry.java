package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepositry extends JpaRepository<Seance,Long> {
    
}

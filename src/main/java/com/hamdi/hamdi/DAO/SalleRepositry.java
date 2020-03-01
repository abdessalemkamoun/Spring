package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SalleRepositry extends JpaRepository<Salle,Long> {
    
}

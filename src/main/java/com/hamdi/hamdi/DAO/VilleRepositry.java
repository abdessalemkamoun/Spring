package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepositry extends JpaRepository<Ville,Long> {
    
}

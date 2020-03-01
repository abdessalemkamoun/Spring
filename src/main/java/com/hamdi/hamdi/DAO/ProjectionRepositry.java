package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectionRepositry extends JpaRepository<Projection,Long> {
    
}

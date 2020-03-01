package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlaceRepositry extends JpaRepository<Place,Long> {
    
}

package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepositry extends JpaRepository<Categorie,Long> {
    
}

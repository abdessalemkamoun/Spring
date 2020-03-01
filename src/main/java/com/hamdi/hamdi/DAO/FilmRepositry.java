package com.hamdi.hamdi.DAO;

import com.hamdi.hamdi.Model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepositry extends JpaRepository<Film,Long> {
    
}

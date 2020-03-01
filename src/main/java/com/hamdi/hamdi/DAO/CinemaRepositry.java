package com.hamdi.hamdi.DAO;


import com.hamdi.hamdi.Model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CinemaRepositry extends JpaRepository<Cinema,Long> {

}

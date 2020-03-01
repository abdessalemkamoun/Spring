package com.hamdi.hamdi.Controller;

import com.hamdi.hamdi.DAO.FilmRepositry;
import com.hamdi.hamdi.DAO.SalleRepositry;
import com.hamdi.hamdi.Model.Film;
import com.hamdi.hamdi.Model.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CinemaController {
    @Autowired
    private SalleRepositry salleRepositry;
    @GetMapping("/afficher")
    public List<Salle> salles(){
        return salleRepositry.findAll();
    }


}

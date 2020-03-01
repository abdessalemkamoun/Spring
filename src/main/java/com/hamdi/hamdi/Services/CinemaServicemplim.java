package com.hamdi.hamdi.Services;

import com.hamdi.hamdi.DAO.*;
import com.hamdi.hamdi.Model.Cinema;
import com.hamdi.hamdi.Model.Place;
import com.hamdi.hamdi.Model.Salle;
import com.hamdi.hamdi.Model.Ville;
import org.hibernate.criterion.InExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class CinemaServicemplim implements  ICinemaService {
    @Autowired
private VilleRepositry villeRepositry;
    @Autowired
    private CinemaRepositry cinemaRepositry;
    private FilmRepositry filmRepositry ;
    private CategorieRepositry categorieRepositry ;
    @Autowired

    private PlaceRepositry placeRepositry ;
    private ProjectionRepositry projectionRepositry ;
    @Autowired
    private  SalleRepositry salleRepositry ;
    private SeanceRepositry seanceRepositry;
    private TicketRepositry ticketRepositry;

    @Override
    public void initVilles() {
        Stream.of( "sfax","tunis","sousse","Djerba").forEach(v->{
            Ville ville =new Ville();
            ville.setName(v);
            villeRepositry.save(ville);

        });

    }

    @Override
    public void initCategorie() {

    }

    @Override
    public void initCinemas() {
        villeRepositry.findAll().forEach(v-> Stream.of("rex","slouma","pathe","lotfi").forEach(Nomcinema->{
            Cinema cinema  =new Cinema();
            cinema.setName(Nomcinema);
            cinema.setNombreSalles(4+(int)(Math.random()*7));
            cinema.setVille(v);
            cinemaRepositry.save(cinema);


        }));

    }

    @Override
    public void initFilms() {

    }

    @Override
    public void initPlaces() {
        salleRepositry.findAll().forEach(salle -> {
            for(int i=0;i<salle.getNbredepalces();i++){
                Place place= new Place();
                place.setSalle(salle);
                place.setNumero(i+1);
                placeRepositry.save(place);

            }
        });

    }

    @Override
    public void initProjections() {

    }

    @Override
    public void initSalles() {

        cinemaRepositry.findAll().forEach(cinema-> {
            for(int i=0;i< cinema.getNombreSalles();i++){
                Salle salle= new Salle();
                salle.setName("selle"+(i+1));
                salle.setCinema(cinema);
                salle.setNbredepalces(4+(int)(Math.random()*10));
                salleRepositry.save(salle);
            }
        });
    }

    @Override
    public void initTickets() {

    }

    @Override
    public void initSeancess() {

    }
}

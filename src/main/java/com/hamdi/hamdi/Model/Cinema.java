package com.hamdi.hamdi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity @AllArgsConstructor @NoArgsConstructor @Data @ToString
public class Cinema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String name ;
    private double longitude, latitude ,attudite ;
    private  int nombreSalles ;
    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles ;
    @ManyToOne
    private  Ville ville ;



}

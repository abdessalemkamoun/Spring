package com.hamdi.hamdi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Data @Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private String name ;
    private  String descrption ;
    private  String realisateur ;
    private Date date ;
    private  double duree ;
    private  String photo ;
    @OneToMany(mappedBy = "film")
    private Collection<Projection> projections ;
    @ManyToOne
    private  Categorie categorie;
}

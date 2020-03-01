package com.hamdi.hamdi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String name ;
    private  int nbredepalces ;
    @ManyToOne
    private Cinema cinema ;
    @OneToMany(mappedBy ="salle")
    private Collection<Place> places ;
    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections ;

}

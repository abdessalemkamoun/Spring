package com.hamdi.hamdi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private int numero ;
    private  long longitude , latitide ,altidue  ;
    @ManyToOne
    private Salle salle ;
  @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;

}

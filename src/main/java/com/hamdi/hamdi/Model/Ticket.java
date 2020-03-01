package com.hamdi.hamdi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity

public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String nomClient ;
    private  double prix ;
    private  int codepayement ;
    private  boolean reserve ;
    @ManyToOne
    private Place place;
    @ManyToOne
    private  Projection projection ;


}

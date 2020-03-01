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
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String name ;
    private  double longitude , attude , allitude ;
@OneToMany(mappedBy = "ville")
    private Collection <Cinema> Cinemas;

}

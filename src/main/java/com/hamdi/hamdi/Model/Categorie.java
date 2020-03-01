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
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private  String name ;
    @OneToMany(mappedBy = "categorie")
    private Collection <Film> films ;
}

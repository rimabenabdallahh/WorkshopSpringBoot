package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Piste implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int idPiste;
    private long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;

    private int length;
    private int slope;
    @ManyToMany
    Set<Skier> skiers;
}

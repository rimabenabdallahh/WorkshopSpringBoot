package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Piste implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;

    private int length;
    private int slope;
    @ManyToMany
    Set<Skier> skiers;
}

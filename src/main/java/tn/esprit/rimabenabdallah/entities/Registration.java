package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRegistration;
    private long numRegistration;
    private int numWeek;
     @ManyToOne
     Skier skier;
     @ManyToOne
    Course course;
}

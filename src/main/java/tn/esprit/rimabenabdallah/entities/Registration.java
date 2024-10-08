package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;

@Entity
public class Registration {
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

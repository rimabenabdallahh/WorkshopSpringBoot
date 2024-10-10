package tn.esprit.rimabenabdallah.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInstructor;
    private long numInstructor;
    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
    
}

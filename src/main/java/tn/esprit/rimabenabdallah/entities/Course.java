package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCourse;
    private long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;
     Support support;
     private float price;
     private int timeSlot;
     @OneToMany(mappedBy = "course")
     Set<Registration> registrations;






}

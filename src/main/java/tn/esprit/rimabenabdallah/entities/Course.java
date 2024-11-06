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
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

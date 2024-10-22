package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

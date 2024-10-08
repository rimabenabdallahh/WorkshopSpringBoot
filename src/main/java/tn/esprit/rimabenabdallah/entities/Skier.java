package tn.esprit.rimabenabdallah.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity

public class Skier{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int idSkier;
    private String name;
    private LocalDate birthDate;
    private int age;
    @OneToOne(mappedBy = "skier")
    Subscription subscription;
   @OneToMany(mappedBy = "skier")
   Set<Registration> registrations;
   @ManyToMany(mappedBy = "skiers")
    Set<Piste>pistes;
}

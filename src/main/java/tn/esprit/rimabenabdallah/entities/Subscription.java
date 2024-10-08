package tn.esprit.rimabenabdallah.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSubscription;
    private long numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;
    @OneToOne
    Skier skier;


}

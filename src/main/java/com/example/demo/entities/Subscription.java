package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
    TypeSubscription typeSub;
}

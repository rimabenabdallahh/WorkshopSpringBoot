package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRegistration;
    private long numRegistration;
    private int numWeek;

}

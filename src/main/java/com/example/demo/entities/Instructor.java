package com.example.demo.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInstructor;
    private long numInstructor;
    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;


}

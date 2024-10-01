package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Piste {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int idPiste;
    private long numPiste;
    private String namePiste;
    Color color;
    private int length;
    private int slope;
}

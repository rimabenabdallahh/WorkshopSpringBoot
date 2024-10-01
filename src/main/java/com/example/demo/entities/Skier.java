package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="t_skier")
public class Skier{
    
    @Id

    private int idSkier;
    private String name;
    private LocalDate birthDate;
    private int age;
}

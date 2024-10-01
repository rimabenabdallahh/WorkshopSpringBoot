package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCourse;
    private long numCourse;
    private int level;
     TypeCourse typeCourse;
     Support support;
     private float price;
     private int timeSlot;
}

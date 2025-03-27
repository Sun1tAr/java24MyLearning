package ru.mpei.java24MyLearning.theory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String type;
    @Column
    private String name;
    @Column(name = "substid")
    private long substId;




}

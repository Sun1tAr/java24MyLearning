package ru.mpei.java24MyLearning.theory.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @Column
    private int id;
    @Column
    private String type;
    @Column
    private String name;
    @Column(name = "substid")
    private String substId;




}

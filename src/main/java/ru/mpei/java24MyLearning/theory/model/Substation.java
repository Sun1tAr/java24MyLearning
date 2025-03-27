package ru.mpei.java24MyLearning.theory.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "substations")
public class Substation {

    @Id
    @Column(name = "substid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column
    private String voltageclass;
}

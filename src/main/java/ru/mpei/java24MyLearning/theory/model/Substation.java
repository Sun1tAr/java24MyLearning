package ru.mpei.java24MyLearning.theory.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "substations")
public class Substation {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column
    private int voltageclass;

    @OneToMany(mappedBy = "substation")
    private List<Equipment> equipment;
}

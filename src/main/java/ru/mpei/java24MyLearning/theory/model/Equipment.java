package ru.mpei.java24MyLearning.theory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String type;
    @Column
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "substation_id")
    private Substation substation;







}

package ru.mpei.java24MyLearning.practice.p1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor @AllArgsConstructor
//@Entity
//@Table(name = "parrots")
public class Parrot {

//    @Id
//    @Column(name = "parrot_id")
    private long id;
//    @Column
    private String name;
//    @Column
    private long age;
//    @Column
    private String color;
}

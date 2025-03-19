package ru.mpei.java24MyLearning.practice.p1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Parrot {

    @Id
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private Color color;
}

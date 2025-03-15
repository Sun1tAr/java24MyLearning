package ru.mpei.java24MyLearning.practice.p1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Parrot {

    private String name;
    private int age;
    private Color color;
}

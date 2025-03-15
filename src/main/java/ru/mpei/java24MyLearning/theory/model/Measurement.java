package ru.mpei.java24MyLearning.theory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Measurement {
     private String name;
     private double value;
}

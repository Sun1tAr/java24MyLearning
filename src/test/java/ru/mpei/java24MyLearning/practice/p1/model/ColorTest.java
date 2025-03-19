package ru.mpei.java24MyLearning.practice.p1.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    void getRandomColor() {
        Color c1 = Color.getRandomColor();
        Color c2 = Color.getRandomColor();
        Color c3 = Color.getRandomColor();
        Color c4 = Color.getRandomColor();
        Color c5 = Color.getRandomColor();
        Color c6 = Color.getRandomColor();
        Color c7 = Color.getRandomColor();
    }
}
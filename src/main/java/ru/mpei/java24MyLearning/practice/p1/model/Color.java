package ru.mpei.java24MyLearning.practice.p1.model;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    PURPLE;

    public static Color getColorFromString(String color) {
        switch (color) {
            case "RED": return RED;
            case "ORANGE": return ORANGE;
            case "YELLOW": return YELLOW;
            case "GREEN": return GREEN;
            case "BLUE": return BLUE;
            case "PURPLE": return PURPLE;
            default: return null;
        }
    }

}

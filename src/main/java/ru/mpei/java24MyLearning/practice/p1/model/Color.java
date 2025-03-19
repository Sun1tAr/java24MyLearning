package ru.mpei.java24MyLearning.practice.p1.model;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    BLACK,
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

    public static Color getRandomColor() {
        int v = (int)(100 * Math.random());
        Color color = BLACK;
        boolean flag = false;
        //  22, 9, 33, 66, 79
        if (!flag & v < 22) { color = Color.RED; flag = true; }
        if (!flag & v < 9) { color = Color.ORANGE; flag = true; }
        if (!flag & v < 33) { color = Color.YELLOW; flag = true; }
        if (!flag & v < 66) { color = Color.GREEN; flag = true; }
        if (!flag & v < 79) { color = Color.BLUE; flag = true; }
        if (!flag & v < 100) { color = Color.PURPLE; flag = true; }
        return color;
    }



}

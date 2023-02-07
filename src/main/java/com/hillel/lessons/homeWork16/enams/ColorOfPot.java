package com.hillel.lessons.homeWork16.enams;

public enum ColorOfPot {

    Grey("Grey"),
    Black("Black"),
    White("White");

    private String color;

    ColorOfPot(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

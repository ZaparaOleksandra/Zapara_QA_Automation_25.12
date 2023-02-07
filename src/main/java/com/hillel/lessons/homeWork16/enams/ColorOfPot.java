package com.hillel.lessons.homeWork16.enams;

public enum ColorOfPot {

    GREY("Grey"),
    BLACK("Black"),
    WHITE("White");

    private String color;

    ColorOfPot(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

package com.hillel.lessons.homeWork16.main;

import com.hillel.lessons.homeWork16.enams.ColorOfPot;
import com.hillel.lessons.homeWork16.glassshop.Cup;
import com.hillel.lessons.homeWork16.glassshop.Pan;
import com.hillel.lessons.homeWork16.glassshop.Pot;

public class Main {

    public static void main(String[] args) {

        Pan pan = new Pan("Tefal", "Gas", "Cast Iron", 150, 25);
        System.out.println(pan);
        System.out.println(pan.getType());
        pan.getHeatingIndicator();
        pan.washing();
        pan.setDiameter(150);
        System.out.println("New diameter is: " + pan.getDiameter());
        pan.washing();
        System.out.println();

        Cup cup = new Cup("Adekor", "children", "ceramic", 8.4,"Winter", 200);
        System.out.println(cup.getType());
        System.out.println(cup);
        cup.setVolume(50);
        System.out.println("New Volume is: " + cup.getVolume());
        System.out.println();

        Pot pot = new Pot("Bergoff", "Induction", "Aluminium", 300, ColorOfPot.GREY);
        System.out.println(pot.getType());
        System.out.println(pot);
        pot.getHeatingIndicator();
    }
}

package com.hillel.lessons.HomeWork12;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер з таким складом: " + this.bun + ", " + this.meat + ", " + this.cheese +
                ", " + this.greenery + ", " + this.mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Дієтичний бургер з таким складом: " + this.bun + ", " + this.meat + ", " +
                this.cheese + ", " + this.greenery);
    }

    public Burger(String bun, String cheese, String greenery) {
        this.bun = bun;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Вегетеріанський бургер з таким складом: " + this.bun + ", " + this.cheese + ", " + this.greenery);
    }
}

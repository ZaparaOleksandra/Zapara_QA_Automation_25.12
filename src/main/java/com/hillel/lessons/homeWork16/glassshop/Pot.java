package com.hillel.lessons.homeWork16.glassshop;

import com.hillel.lessons.homeWork16.abstractions.DishShop;
import com.hillel.lessons.homeWork16.enams.ColorOfPot;
import com.hillel.lessons.homeWork16.interfaces.Heating;

public class Pot extends DishShop implements Heating {

    private ColorOfPot color;

    public Pot(String company, String purpose, String material, double price, ColorOfPot color) {
        super(company, purpose, material, price);
        this.color = color;
    }

    @Override
    public Object getType() {
        return "The pot with price: " + getPrice() + " and color: " + color.getColor();
    }

    @Override
    public String toString() {
        return "Description of the pot: " + "\nManufacturer is: " + getCompany() + "\nPurpose for: " + getPurpose();
    }

    @Override
    public void getHeatingIndicator() {
        System.out.println("No heating indicator for " + getMaterial());
    }
}

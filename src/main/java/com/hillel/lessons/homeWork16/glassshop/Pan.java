package com.hillel.lessons.homeWork16.glassshop;

import com.hillel.lessons.homeWork16.abstractions.DishShop;
import com.hillel.lessons.homeWork16.interfaces.Heating;

public class Pan extends DishShop implements Heating {

    private double diameter;

    public Pan(String company, String purpose, String material, double price, double diameter) {
        super(company, purpose, material, price);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter > 10) {
            this.diameter = diameter;
        }
    }

    public void washing() {
        if (getDiameter() <= 100) {
            System.out.println("Washing is allowed in the dishwasher");
        } else {
            System.out.println("Washing is NOT allowed in the dishwasher");
        }
    }

    @Override
    public  Object getType() {
        return "The pan with price: " + getPrice() + " and Purpose for: " + getPurpose();
    }

    @Override
    public String toString() {
        return "More details of the pan: " + "\nManufacturer is: " + getCompany() + "\nDiameter: " + getDiameter();
    }

    @Override
    public void getHeatingIndicator() {
        System.out.println("Idler heating there for " + getMaterial());
    }
}

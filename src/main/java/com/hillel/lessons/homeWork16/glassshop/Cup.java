package com.hillel.lessons.homeWork16.glassshop;

import com.hillel.lessons.homeWork16.abstractions.DishShop;

public final class Cup extends DishShop {

    private String design;
    private double volume;

    public Cup(String company, String purpose, String material, double price, String design, double volume) {
        super(company, purpose, material, price);
        this.design = design;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > 10) {
            this.volume = volume;
        }
    }

    @Override
    public Object getType() {
        return "Description of the cup: " + "\nManufacturer is: " + getCompany() + "\nDesign: " + design + "\nVolume is: " + getVolume();
    }

    @Override
    public String toString() {
        return "The Cup is designed for " + getPurpose() + " with price: " + getPrice() + "\nMaterial: " + getMaterial();
    }
}

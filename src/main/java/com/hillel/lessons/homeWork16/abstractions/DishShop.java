package com.hillel.lessons.homeWork16.abstractions;

public abstract class DishShop {

    private String company;
    private String purpose;
    private String material;
    private double price;

    public DishShop(String company, String purpose, String material, double price) {
        this.company = company;
        this.purpose = purpose;
        this.material = material;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null && !company.isEmpty()) {
            this.company = company;
        }
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    protected abstract Object getType();
}

package com.hillel.lessons.HomeWork15;

public class Cat {

    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 20) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0.5 && weight < 60) {
            this.weight = weight;
        }
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 9,3.2);

        System.out.println("Cat name: " + cat.getName() + "\nCat age: " + cat.getAge() + "\nCat weight: " + cat.getWeight());
        cat.sayMeow();
    }
}

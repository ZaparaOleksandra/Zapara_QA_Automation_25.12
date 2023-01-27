package com.hillel.lessons.HomeWork14;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Person {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    private String surName;
    private double weight;
    private double pressure;
    private int numberSteps;
    private int age;
    public Person(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone,
                  String surName, double vaga, double tusk, int numberSteps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surName = surName;
        this.weight = vaga;
        this.pressure = tusk;
        this.numberSteps = numberSteps;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 1) {
            this.weight = weight;
        }
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        if (pressure > 50 && pressure < 300) {
            this.pressure = pressure;
        }
    }

    public int getNumberSteps() {
        return numberSteps;
    }

    public void setNumberSteps(int numberSteps) {
        if (numberSteps > 0) {
            this.numberSteps = numberSteps;
        }
    }

    public int getAge() {
        LocalDate localDate =  new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        age  = year - yearOfBirth;
        return age;
    }

    @Override
    public String toString() {
        return this.name + ' '+ getSurName() + "\n" + this.dayOfBirth + '.' + this.monthOfBirth + '.' + this.yearOfBirth
                + "\nEmail: " + this.email + ", phone: " + this.phone  + "\nWeight: " + getWeight() + ", pressure: " + getPressure()
                + ", numberSteps: " + getNumberSteps() + "\n" + getAge() + " years old \n";
    }

    public void printAccountInfo() {
        System.out.println(this);
    }
}

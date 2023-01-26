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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    private double pressure;

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        if (pressure > 0) {
            this.pressure = pressure;
        }
    }

    private int numberSteps;

    public int getNumberSteps() {
        return numberSteps;
    }

    public void setNumberSteps(int numberSteps) {
        if (pressure > 0) {
            this.numberSteps = numberSteps;
        }
    }

    private int age;
    Date date = new Date();
    LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int year  = localDate.getYear();

    public int getAge() {
        age  = year - yearOfBirth;
        return age;
    }

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

    public void printAccountInfo() {
        System.out.println(this.name + ' '+ getSurName() + "\n" + this.dayOfBirth + '.' + this.monthOfBirth + '.' + this.yearOfBirth + "\n"
                + "Email: " + this.email + ", phone: " + this.phone +  "\n" + "Weight: " + getWeight() + ", pressure: " + getPressure()
                + ", numberSteps: " + getNumberSteps() + "\n" + getAge() + " years old");
        System.out.println();
    }
}

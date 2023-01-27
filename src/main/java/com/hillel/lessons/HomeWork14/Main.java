package com.hillel.lessons.HomeWork14;

public class Main {
    public static void main(String[] args) {

        Person personFirst = new Person("Vasia", 1,10,1983,"vasia@gmail.com",
                "777522","Proshko", 75.5, 135.2,12558);
        personFirst.printAccountInfo();
        Person personSecond = new Person("Sasha", 30,3,1990,"sasha@gmail.com",
                "222222","Petrova", 65.2, 120.5,15000);
        personSecond.printAccountInfo();
        Person personThird = new Person("Katia", 24,12,1995,"katia@gmail.com",
                "3435353","Gira", 50.8, 119.8,150);
        personThird.printAccountInfo();
        Person personFourth = new Person("Petia", 14,6,1987,"petia@gmail.com",
                "1414145","Qwerty", 100.8, 145.5,9999);
        personFourth.printAccountInfo();

        personSecond.setWeight(60.8);
        personSecond.setNumberSteps(4820);
        personSecond.printAccountInfo();

        personFourth.setPressure(130);
        personFourth.setWeight(95.5);
        personFourth.setSurName("Qwerty1");
        personFourth.printAccountInfo();
    }
}

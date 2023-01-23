package com.hillel.lessons.HomeWork13;

public class Androids implements SmartPhones, LinuxOS{
    private String name = "Android";

    @Override
    public void call() {
        System.out.println("Call from " + name);
    }

    @Override
    public void sms() {
        System.out.println("Sms from " + name);
    }

    @Override
    public void internet() {
        System.out.println("Internet from " + name);
    }
    @Override
    public void getOperationSystem() {
        System.out.println("Operation System for " + name);

    }
}

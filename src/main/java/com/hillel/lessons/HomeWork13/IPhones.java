package com.hillel.lessons.HomeWork13;

public class IPhones implements SmartPhones, IOS{
    private String name = "iPhone";

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
    public void getOperationVersion() {
        System.out.println("Operation Version for " + name);
    }
}

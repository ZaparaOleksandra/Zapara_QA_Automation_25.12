package com.hillel.lessons.HomeWork13;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.getOperationSystem();

        IPhones iPhone = new IPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.getOperationVersion();

    }
}

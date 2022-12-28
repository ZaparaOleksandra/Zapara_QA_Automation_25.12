package com.hillel.lessons.HomeWork4;

public class VolumeParallelepiped {
    public static void main(String[] args) {
        int length = 25;
        int width = 50;
        int height = 10;
        int volumeOfParallelepiped = length * width * height;
        int lengthOfSides = 4 * (length + width + height);

        System.out.println("Об'єм паралелепіпеда = " + volumeOfParallelepiped);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + lengthOfSides);

    }
}

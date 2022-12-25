package com.hillel.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        byte byteVariable = -128;
        System.out.println(byteVariable);

        byteVariable = 101;
        System.out.println(byteVariable);

        byteVariable = 102;
        System.out.println(byteVariable);


        short shortVariable = 32000;
        int intVariable = 2123456789;

        long longVariable = 4545345345345345454L;


        float floatVariable = 1.123456789F;
        double doubleVariable = 234231.123456789123456789;
        System.out.println();
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        System.out.println();
        char charVariable = 'A';
        char charVariable2 = 65;
        char charVariable3 = '\u5143';

        System.out.println(charVariable);
        System.out.println(charVariable2);
        System.out.println(charVariable3);

        System.out.println("Привет");


        boolean booleanTrue = true;
        boolean booleanFalse = false;

        System.out.println(booleanTrue);
        System.out.println(booleanFalse);
        System.out.println();


        String str = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";
        String str4 = new String("Hello");

        System.out.println(str);
        System.out.println(str2);



        byte byte1 = 127;
        short short1 = byte1;
        System.out.println(short1);



        char charA = 'A';
        int intA = charA;
        System.out.println(intA);


        int age = 28;
        double ageDouble = age;
        System.out.println(ageDouble);


        byte byte2 = 127;
        double double2 = byte2;
        System.out.println(double2);


        System.out.println();

        int x = 129;
        byte y = (byte) x;
        System.out.println(x);
        System.out.println(y);


        int x2 = y;
        System.out.println(x2);


        double a = 65.74638745637;
        System.out.println((int) a);
        

        final double PI = 3.14159265358979323846;
        System.out.println(PI);


        double x1 = 27.1745895;
        System.out.print("North: " + x1 + "°");


    }
}

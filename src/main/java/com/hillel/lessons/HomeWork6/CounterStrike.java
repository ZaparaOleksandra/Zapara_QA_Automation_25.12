package com.hillel.lessons.HomeWork6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fragFirstPlayerFstTeam = 0;
        int fragSecondPlayerFstTeam = 0;
        int fragThirdPlayerFstTeam = 0;
        int fragFourthPlayerFstTeam = 0;
        int fragFifthPlayerFstTeam = 0;
        int fragFirstPlayerSecTeam = 0;
        int fragSecondPlayerSecTeam = 0;
        int fragThirdPlayerSecTeam = 0;
        int fragFourthPlayerSecTeam = 0;
        int fragFifthPlayerSecTeam = 0;
        int numberOfPlayerFstTeam = 5;
        int numberOfPlayerSecTeam = 5;

        System.out.println("Ввести ім'я першої команди:");
        String nameOfFirstTeam = scanner.nextLine();
        System.out.println("Iм'я першої команди: " + nameOfFirstTeam);
        System.out.println("Ввести кількість фрагів 1-го гравця першої команди:");
        if (scanner.hasNextInt()) {
            fragFirstPlayerFstTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 2-го гравця першої команди:");
        if (scanner.hasNextInt()) {
            fragSecondPlayerFstTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 3-го гравця першої команди:");
        if (scanner.hasNextInt()) {
            fragThirdPlayerFstTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 4-го гравця першої команди:");
        if (scanner.hasNextInt()) {
            fragFourthPlayerFstTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 5-го гравця першої команди:");
        if (scanner.hasNextInt()) {
            fragFifthPlayerFstTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.println("Ввести ім'я другої команди:");
        String nameOfSecondTeam = scanner.nextLine();
        System.out.println("Iм'я другої команди: " + nameOfSecondTeam);
        System.out.println("Ввести кількість фрагів 1-го гравця другої команди:");
        if (scanner.hasNextInt()) {
            fragFirstPlayerSecTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 2-го гравця другої команди:");
        if (scanner.hasNextInt()) {
            fragSecondPlayerSecTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 3-го гравця другої команди:");
        if (scanner.hasNextInt()) {
            fragThirdPlayerSecTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 4-го гравця другої команди:");
        if (scanner.hasNextInt()) {
            fragFourthPlayerSecTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        System.out.println("Ввести кількість фрагів 5-го гравця другої команди:");
        if (scanner.hasNextInt()) {
            fragFifthPlayerSecTeam = scanner.nextInt();
        } else {
            System.out.println("Вибачте, це не ціле число. Перезавантажте програму і спробуйте ще раз!");
            System.exit(0);
        }
        int sumFragFirstTeam = fragFirstPlayerFstTeam + fragSecondPlayerFstTeam + fragThirdPlayerFstTeam + fragFourthPlayerFstTeam + fragFifthPlayerFstTeam;
        double avrFirstTeam = (double) sumFragFirstTeam / numberOfPlayerFstTeam;
        System.out.println("Cереднє арифметичне балів " + nameOfFirstTeam + " команди: " +  avrFirstTeam);
        int sumFragSecondTeam = fragFirstPlayerSecTeam + fragSecondPlayerSecTeam + fragThirdPlayerSecTeam + fragFourthPlayerSecTeam + fragFifthPlayerSecTeam;
        double avrSecondTeam = (double) sumFragSecondTeam / numberOfPlayerSecTeam;
        System.out.println("Cереднє арифметичне балів " + nameOfSecondTeam + " команди: " + avrSecondTeam);

        if (avrFirstTeam > avrSecondTeam) {
            System.out.println("Перемогла команда " + nameOfFirstTeam + " набрала " + avrFirstTeam + " очків");
        } else  if (avrFirstTeam < avrSecondTeam){
            System.out.println("Перемогла команда " + nameOfSecondTeam + " набрала " + avrSecondTeam + " очків");
        } else {
            System.out.println("Перемогла дружба");
        }
    }
}

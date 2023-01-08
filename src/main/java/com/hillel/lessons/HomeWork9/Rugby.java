package com.hillel.lessons.HomeWork9;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int [] firstTeam = new int [25];
        int [] secondTeam = new int [25];
        int sumAgeFirstTeam = 0;
        int sumAgeSecondTeam = 0;

        for (int ageFirstTeam = 0; ageFirstTeam < firstTeam.length; ageFirstTeam++) {
            firstTeam[ageFirstTeam] = (int) (Math.random() * (23)) + 18;
        }
        System.out.println("Вік гравців першої команди: " + Arrays.toString(firstTeam));

        for (int ageSecondTeam = 0; ageSecondTeam < secondTeam.length; ageSecondTeam++) {
            secondTeam[ageSecondTeam] = (int) (Math.random() * (23)) + 18;
        }
        System.out.println("Вік гравців другої команди: " + Arrays.toString(secondTeam));

        for (int ageFirstTeam : firstTeam) {
            sumAgeFirstTeam += ageFirstTeam;
        }
        double avgAgeFirstTeam = (double) sumAgeFirstTeam / firstTeam.length;
        System.out.println("Середній вік гравців першої команди = " + avgAgeFirstTeam);

        for (int ageSecondTeam : secondTeam) {
            sumAgeSecondTeam += ageSecondTeam;
        }
        double avgAgeSecondTeam = (double) sumAgeSecondTeam / secondTeam.length;
        System.out.println("Середній вік гравців другої команди = " + avgAgeSecondTeam);

        if (avgAgeFirstTeam > avgAgeSecondTeam) {
            System.out.println("Середній вік гравців першої команди більше");
        } else if (avgAgeFirstTeam < avgAgeSecondTeam) {
            System.out.println("Середній вік гравців другої команди більше");
        } else {
            System.out.println("Середній вік гравців рівний");
        }
    }
}

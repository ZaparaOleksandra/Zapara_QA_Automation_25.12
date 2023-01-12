package com.hillel.lessons.HomeWork10;

import java.util.Scanner;

public class MatrixTransconstruction {
    public static void main(String[] args) {

        int n = 0;
        int m = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("You entered no number. Please, try again ");
            System.exit(0);
        }

        System.out.println("Enter number of columns ");
        if (scanner.hasNextInt()) {
            m = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("You entered no number. Please, try again ");
            System.exit(0);
        }

        int[][] arrayFirst = new int[n][m];
        int[][] arraySecond = new int[m][n];

        for (n = 0; n < arrayFirst.length; n++) {
            for (m = 0; m < arrayFirst[n].length; m++) {
                arrayFirst[n][m] = (int) (Math.random() * 101);
                arraySecond[m][n] = arrayFirst[n][m];
            }
        }
        System.out.println("First array");
        for (n = 0; n < arrayFirst.length; n++) {
            for (m = 0; m < arrayFirst[n].length; m++) {
                System.out.print(arrayFirst[n][m] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second array");
        for (m = 0; m < arraySecond.length; m++) {
            for (n = 0; n < arraySecond[m].length; n++) {
                System.out.print(arraySecond[m][n] + "\t");
            }
            System.out.println();
        }
    }
}

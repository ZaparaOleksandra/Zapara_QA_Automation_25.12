package com.hillel.lessons.HomeWork7;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int progNumber = (int) (Math.random() * 11);
        int userNumber;
        int counter = 0;
		System.out.println("The computer chose number from 0 to 10. Try to guess! ");
        do {
            counter++;
			System.out.print("Enter number from 0 to 10: ");
            Scanner input = new Scanner(System.in);
			if(input.hasNextInt()) {
				userNumber = input.nextInt();
				if(userNumber == progNumber) {
					System.out.println("You win!");{
                        break;
                    }
				} else {
						if(progNumber < userNumber) {
							System.out.println("The computer chose a smaller number ");
						} else {
							System.out.println("The computer chose a higher number");
					}
				}
			} else {
			System.out.println("You entered no number");
            input.nextLine();
			}
        } while(counter <= 2);
        System.out.println("If you want to play again!:)");
    }
}

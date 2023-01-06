package com.hillel.lessons.HomeWork7;

public class Shuttle {

    public static void main(String[] args) {
        int counter = 0;
        int shuttle = 0;
        do {
            shuttle++;
            if ((shuttle / 100) == 4 || (shuttle % 100) == 4 || ((shuttle % 100) / 10) == 4 || (shuttle % 10) == 4
                    || (shuttle / 100) == 9 || (shuttle % 100) == 9 || ((shuttle % 100) / 10) == 9 || (shuttle % 10) == 9) {
                continue;
            }
            System.out.println("Shuttle number - " + shuttle);
            counter++;
        } while (counter < 100);
        System.out.println("Number of shuttles " + counter);
    }
}










//        int counter = 0;
//        int shattle = 0;
//        do {
//            shattle++;
//            if ((shattle / 100) == 4 || (shattle % 100) == 4 || ((shattle % 100) / 10) == 4 || (shattle % 10) == 4
//                        || (shattle / 100) == 9 || (shattle % 100) == 9 || ((shattle % 100) / 10) == 9 || (shattle % 10) == 9) {
//                    continue;
//                }
//                System.out.println(shattle);
//                counter++;
//
//        } while ((counter < 100));
//        System.out.println("Shattle number " + counter);
//    }
//}
//




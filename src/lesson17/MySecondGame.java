package lesson17;

import java.util.Scanner;

public class MySecondGame {
    public static void main(String[] args) {
        //1.Computer generate one digit
        //2. Business logic of the game
        //3.add Scanner
        //4. Count attempt
        //System.out.println(generateDigit());
        //System.out.println(compareNumbers());
        game();
    }

    private static void game() {
        Scanner input = new Scanner(System.in);
        int digit = generateDigit();
        System.out.println("Say the number from 0 to 100");
        int number = input.nextInt();
        System.out.println(compareNumbers(number, digit));
        int numberAttempts = 1;
        while (numberAttempts < 10) {
            System.out.println("Attempt: " + numberAttempts);
            System.out.println();
            number = input.nextInt();
            System.out.println(compareNumbers(number, digit));
            numberAttempts++;
            if (number == digit) {
                System.out.println("You guess");
                return;
            }
        }
        System.out.println("Your attempts are over");
    }

    private static String compareNumbers(int number, int digit) {
        if (number == digit) {
            return "Bingo!";
        } else if (number > digit) {
            return "number>digit";
        } else {
            return "number<digit";
        }
    }

    public static int generateDigit() {
        return (int) (Math.random() * 100);
        //(max-min)+1+min;
    }
}

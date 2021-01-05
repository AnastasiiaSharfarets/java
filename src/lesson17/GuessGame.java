
package lesson17;

import java.util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        gameStarter();
        game();
    }

    private static void gameStarter() {
        GuessGame.game();
    }

    private static void game() {
        int range = customerRange();
        int attempts = customerAttempts();
        int secretComputerNumber = generateDigit(range);

        //выиграл, если в указанное число попыток, он угадал
        //проиграл, если попытки закончились

        int countAttempts = 0;
        System.out.println("Давай начнем игру");
        //while(number!=digit
        int customerNumber;
        Scanner scr = new Scanner(System.in);
        customerNumber = scr.nextInt();
        while (customerNumber != secretComputerNumber) {
            System.out.println();
            System.out.println(compare(customerNumber, secretComputerNumber));
            System.out.println("Введите число снова");
            customerNumber = scr.nextInt();
            countAttempts++;
            if (attempts == countAttempts) {
                attemptsDone(countAttempts);
            }
        }

        System.out.println("Игра закончена");
    }

    private static String compare(int customerNumber, int secretComputerNumber) {
        if (customerNumber == secretComputerNumber) {
            return "Вы угадали";
        } else if (customerNumber > secretComputerNumber) {
            return "выше число больше загаданного";
        } else {
            return "ваше число меньше загаданного";
        }
    }


    private static void attemptsDone(int countAttempts) {
        System.out.println("Игра закончена, вы проиграли, использовано "
                + countAttempts + " попыток");
    }

    private static int customerAttempts() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Я рекомендую для диапазона от нуля до ста, не менее пяти попыток");
        System.out.println("За сколько попыток ты хочешь отдать моё число?");
        return scr.nextInt();
    }

    public static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason);
        //(max-min)+1+min;
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Скажи число, в диапазоне которого я должен загадать число");
        return scr.nextInt();
        //return 10;
    }
}


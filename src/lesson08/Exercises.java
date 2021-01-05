package lesson08;

public class Exercises {
    // Даны целые числа A и B, где B > 0. Вывести B раз число A

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        printA(x, y);
        printA(7,8);
    }

    public static void printA(int x, int y) {
        System.out.println();// новая строка
        for (int i = 0; i < y; i++) {
            System.out.print(x + " ");
        }
    }
}


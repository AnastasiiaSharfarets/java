package lesson10;

public class Modulo11 {
    //Напишите программу, которая находит числа кратные 11 между a и b.
    public static void main(String[] args) {
        System.out.println(modulo11(120));
        System.out.println(modulo11(11));

        checkModulo11AandB(0, 1000);

    }

    public static boolean modulo11(int number) {

        return number % 11 == 0;
    }

    public static void checkModulo11AandB(int a, int b) {
        for (int i = a; i < b; i++) {
            boolean modulo11 = modulo11(i);
            if (modulo11) {
                System.out.print(i + " ");
            }
        }

    }
}


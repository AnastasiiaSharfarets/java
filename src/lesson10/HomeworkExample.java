package lesson10;

public class HomeworkExample {
    // напишите программу, которая проверяет год на високосность. Кратный четырем.
    public static void main(String[] args) {
        System.out.println(leapYear(2020));//true
        System.out.println(leapYear(2021));//false
        System.out.println(leapYear(2000));//false

        //напишите программу, которая находит числа кратные 11, между а и b
        System.out.println(modulo11(120));
        System.out.println(modulo11(11));

        checkModulo11AandB(10, 100);

    }

    public static void checkModulo11AandB(int a, int b) {
        for (int i = a; i < b; i++) {
            if (modulo11(i) == true) {
                System.out.println(modulo11(i));

            }
        }
    }

    public static boolean modulo11(int number) {
        return number % 11 == 0;
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 == 0;
    }

}

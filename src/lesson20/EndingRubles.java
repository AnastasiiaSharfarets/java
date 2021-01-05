package lesson20;

public class EndingRubles {
    public static void main(String[] args) {
        //Дано два целых положительных числа. Реализовать метод, который для каждого числа от a до b печатает строку вида “23 рубля”.
        printSumInRub(200, 298); //->
        /*
        1 рубль
        2 рубля
        3 рубля
        4 рубля
        5 рублей
        */
        System.out.println(rightEnding(821));
    }

    private static String rightEnding(int number) {
        int lastDigit = number % 10;
        int prelastDigit = (number / 10) % 10;
        if (prelastDigit == 1) {
            return number + " рублей";
        } else {
            if (lastDigit == 1) {
                return number + " рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                return number + " рубля";
            } else {
                return number + " рублей";
            }
        }
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(rightEnding(i));
           /* int lastDigit = i % 10;//последняя цифра числа
            int prelastDigit = (i / 10) % 10; //предпоследняя цифра. От них зависит окончание в русском языке
            if (prelastDigit == 1) {
                System.out.println(i + " рублей");
            } else {
                if (lastDigit == 1) {
                    System.out.println(i + " рубль");
                } else if (lastDigit >= 2 && lastDigit <= 4) {
                    System.out.println(i + " рубля");
                } else {
                    System.out.println(i + " рублей");
                }*/
        }
    }
}


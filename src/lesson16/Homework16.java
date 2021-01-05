package lesson16;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));//→ true
        System.out.println(makeBricks(3, 1, 9));//→ false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(0, 2, 10));// → true
        System.out.println(makeBricks2(10, 0, 9));// → true
        System.out.println();
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));//→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        System.out.println();
        System.out.println(doubleChar2("LLLkkk"));
        System.out.println();
        multiplicationTable(3);
        System.out.println();
        printDivisors(900);
        System.out.println();
        myPass(20);


    }

    private static String myPass(int size) {
        String result = "";
        String symbols = "abcdefghijklmnopqrstuvwxyz0123456789!#*&$";
        int max = symbols.length();
        for (int i = 0; i < size; i++) {
            int charIndex = (int) (Math.random() * max);
            char symbol = symbols.charAt(charIndex);
            result = result + symbol;
        }

        return result;
    }

    private static void printDivisors(int number) {
        //вывести все делители числа
        int numberDivisors = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
                numberDivisors++;
            }
        }
        System.out.println("Total divisors: " + numberDivisors);
    }

    private static void multiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + "*" + i + "=" + (a * i));
            System.out.println();
        }
    }


    private static String doubleChar(String str) {
        //Дана строка.Получить строку, к которой каждой символ введеной строки удваивается(дублируется)
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return result;
    }

    private static String doubleChar2(String str) {
        //Дана строка.Получить строку, к которой каждой символ введеной строки удваивается(дублируется)
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            //output  = output + str.charAt(i)+str.charAt(i);
            output = output + nTimesRepeat(str.charAt(i), 2);
        }
        return output;
    }

    private static String nTimesRepeat(char symbol, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + symbol;
        }
        return result;
    }

    private static boolean makeBricks(int small, int big, int goal) {
        //дано: маленькие кирпичи (длина=1) и большие (длина=5).
        //вывести истину, если длина ряда больше или равна цели

        return (small * 1) + (big * 5) >= goal;
    }

    private static boolean makeBricks2(int small, int big, int goal) {
        return small + big * 5 == goal || small == goal || big * 5 == goal;
    }
}

package lesson13;

import lesson12.MyColor;

import java.util.Spliterator;

public class Homework13<lastLetterB> {
    public static void main(String[] args) {
        //You have a red lottery ticket showing ints a, b, and c,
        // each of which is 0, 1, or 2. If they are all the value 2, the result is 10.
        //Otherwise if they are all the same, the result is 5.
        // Otherwise so long as both b and c are different from a, the result is 1.
        //Otherwise the result is 0.
        System.out.println(redTicket(2, 2, 2));//→ 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(0, 1, 2));// → 1
        split();
        //Given 2 strings, a and b, return a new string made of the first char of a
        // and the last char of b, so "yo" and "java" yields "ya".
        // If either string is length 0, use '@' for its missing char.

        System.out.println(lastChars("last", "chars"));//→"ls"
        System.out.println(lastChars("yo", "java"));// →"ya"
        System.out.println(lastChars("hi", ""));//→"h@"
        System.out.println(lastChars("", ""));//→"@@"
        split();
        System.out.println(finalPriceWindowsDoors(2.5, 1.5, 3, 6));
        split();
        System.out.println(lastChars2("jhjjk", "jghd"));
        split();
        System.out.println(finalPriceWindowsDoors2(0.2, 0.9, 4, 3));

    }

    private static double finalPriceWindowsDoors(double a, double b, int numberWindows, int numberDoors) {
        //рассчитать стоимоть замены окон и дверей для одной квартиры, если
        //парамеиры двери (2м*0,9м, цена за косяк 100евро, сама дверь120евро
        //окна с параметрами а и b, цена за косяк 100евро, цена окна 100евро

        return numberDoors * (100 * 2 * (2 + 0.9) + 120 * (2 * 0.9))
                + numberWindows * ((a + b) * 2 * 100 + (a * b) * 100);

    }

    private static double finalPriceWindowsDoors2(double a, double b, int numberWindows, int numberDoors) {

        return doorsPrice(numberDoors) + windowsPrice(numberWindows, a, b);
    }

    private static double windowsPrice(int numberWindows, double a, double b) {
        double windowsMeterPrice = 100.00;
        double frameWindowsPrice = 100.00;
        double perimeter = (a + b) * 2;
        double area = a * b;
        return  numberWindows*(perimeter*frameWindowsPrice +area* windowsMeterPrice);
    }

    private static double doorsPrice(int numberDoors) {
        double doorsMeterPrice = 120.00;
        double frameDoorPrice = 100.00;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;
        return (perimeter * frameDoorPrice + area * doorsMeterPrice) * numberDoors;

    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return "@" + "@";
        } else if (a.length() == 0) {
            return "@" + (b.charAt(b.length() - 1));
        } else if (b.length() == 0) {
            return a.charAt(0) + "@";
        }
        return String.valueOf(a.charAt(0)) + String.valueOf(b.charAt(b.length() - 1));
    }

    private static String lastChars2(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        String firstLetterFirstWord = a.substring(0, 1);
        String lastLetterSecondWord = b.substring(b.length() - 1);
        return firstLetterFirstWord + lastLetterSecondWord;
    }


    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && c != a) {
            return 1;
        }
        return 0;
    }

    public static void split() {
        System.out.println(MyColor.ANSI_CYAN + "_____________" + MyColor.ANSI_RESET);
    }
}

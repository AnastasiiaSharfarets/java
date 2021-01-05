package lesson10;


public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println(evenNumber(2));
        System.out.println(oddNumber(55));
        System.out.println(findEvenOrOddNumber(221));
    }

    public static String evenNumber(int a) {
        if (a % 2 == 0) {
            return "четное";
        } else return "нечетное";

    }

    private static String oddNumber(int b) {
        //return !oddNumber(number);
        if (!(b % 2 == 0)) {
            return "нечетное";
        } else {
            return "четное";
        }
    }

    public static String findEvenOrOddNumber(int c) {
        System.out.println(c);
        if (c % 2 == 0) {
            return ("четное");
        } else {
            return ("нечетное");
        }
    }
}

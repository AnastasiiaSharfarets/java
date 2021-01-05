package lesson10;

public class Exercise08 {
    public static void main(String[] args) {
        //Given three ints, a b c, return true if two or more of them have the same rightmost digit.
        // The ints are non-negative.
        // верните истину, если две или более чисел имеют одинаковую последнюю цифру
        //the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3)); //→ true
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;

    }
}

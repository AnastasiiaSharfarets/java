package lesson28;

import java.util.Arrays;

public class Homework28 {
    public static void main(String[] args) {
        //Ex. 5.Logic02. For this problem, we'll round an int value up to the next multiple of 10
        // if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately,
        // round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
        //Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition,
        //write a separate helper "public int round10(int num)
        // {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
        System.out.println("Ex5. Logic02");
        System.out.println(roundSum(16, 17, 18));// →60
        System.out.println(roundSum(12, 13, 14));// →30
        System.out.println(roundSum(6, 4, 4));// →10
        //System.out.println(round10(7));

        //Ex9. String02. Given two strings, return true
        // if either of the strings appears at the very end of the other string,
        // ignoring upper/lower case differences (in other words, the computation
        // should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
        System.out.println("Ex9. String02");
        System.out.println(endOther("Hiabc", "abc"));// →true
        System.out.println(endOther("AbC", "HiaBc"));// →true
        System.out.println(endOther("abc", "abXabc"));// →true

        //Ex.19. Arrays01. Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        System.out.println("Ex19. Arrays01");
        System.out.println(Arrays.toString(makePi())); // → [3, 1, 4]
    }

    private static int[] makePi() {
        int[] result = new int[3];
        int numberPi = (int) (Math.PI * 100);
        result[0] = numberPi / 100;
        result[1] = (numberPi / 10) % 10;
        result[2] = numberPi % 10;
        return result;
    }

    private static boolean endOther(String str1, String str2) {
        String lowStr1 = str1.toLowerCase();
        String lowStr2 = str1.toLowerCase();
        return lowStr1.endsWith(lowStr2) || lowStr2.endsWith(lowStr1);
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private static int round10(int number) {
        int rightmost = number % 10;
        if (rightmost >= 5) {
            return number + (10 - rightmost);
        } else
            return number - rightmost;
    }
}

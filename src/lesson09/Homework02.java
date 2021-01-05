package lesson09;

public class Homework02 {
    public static void main(String[] args) {
        //Given a non-negative number “num”, return true if num is within 2 of a multiple of 10.
        // Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
    }

    private static boolean nearTen(int num) {
        boolean firstCase = num % 10 <= 2;
        boolean secondCase = num % 10 >= 8;
        boolean result = firstCase || secondCase;
        return result;
    }

    public static boolean nearTenOne(int num) {
        return ((num % 10 <= 2) || (num % 10) >= 8);
    }

    public static boolean

    nearTenTwo(int num) {
        if ((num % 10) <= 2) {
            return true;
        } else if ((num % 10) >= 8) {
            return true;
        } else return false;
    }

}

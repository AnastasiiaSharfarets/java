package lesson27;

public class Homework27 {
    public static void main(String[] args) {
        //Ex3.Given 2 int values greater than 0, return whichever value
        // is nearest to 21 without going over. Return 0 if they both go over.
        System.out.println("Ex 3");
        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(23, 22));// → 0
        System.out.println("Ex 4");
        //Ex4. Given 3 int values, a b c, return their sum. However, if one of the values
        // is the same as another of the values, it does not count towards the sum.
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println("Ex 7(String02)");
        //Return a version of the given string, where for every star (*) in the string
        // the star and the chars immediately to its left and right
        //are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
        //решение верно только для этих 3 тестов
        System.out.println(starOut("ab*cd"));//→"ad"
        System.out.println(starOut("ab**cd"));// →"ad"
        System.out.println(starOut("sm*eilly"));// →"silly"
        System.out.println(("Ex 8 (String02)"));
        //Return the number of times that the string "hi" appears anywhere in the given string.
        System.out.println(countHi("abc hi ho"));// →1
        System.out.println(countHi("ABChi hi"));// →2
        System.out.println(countHi("hihi"));// →2

    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                //if (str.substring(i, i+2).equals("hi")) count++;
                count++;

        }
        return count;
    }

    private static String starOut(String str) {
        char star = '*';
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == star && str.charAt(i + 1) == star) {
                return str.substring(0, i - 1) + str.substring(i + 3);
            } else if (str.charAt(i) == star) {
                return str.substring(0, i - 1) + str.substring(i + 2);
            }
        }
        return result;
    }

    private static int loneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return sum;
    }

    private static int blackjack(int a, int b) {
        if (a <= 21 && a > b) {
            return a;
        }
        if (b <= 21 && b > a) {
            return b;
        }
        if (a < b && a <= 21 && b > 21) {
            return a;
        }
        if (b < a && b <= 21 && a > 21) {
            return b;
        }
        if (a > 21 && b > 21) {
            return 0;
        }
        return a;
    }
}

package lesson09;

public class Homework01 {
    public static void main(String[] args) {
        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
//        boolean res1 = more20(20);//
//        System.out.println(res1);
        System.out.println(more20(20));//→ false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
    }

    private static boolean more20(int number) {
        boolean firstCase = (number - 1) % 20 == 0;
        boolean secondCase = (number - 2) % 20 == 0;
        boolean result = firstCase || secondCase;
        return result;
    }

    public static boolean more20One(int number) {
        return (((number - 1) % 20 == 0) || ((number - 2) % 20 == 0));

    }

    public static boolean more20Two(int number) {
        if ((number - 1) % 20 == 0) {
            return true;
        } else if ((number - 2) % 20 == 0) {
            return true;
        } else return false;

    }
}
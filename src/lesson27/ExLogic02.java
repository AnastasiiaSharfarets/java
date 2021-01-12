package lesson27;

public class ExLogic02 {
    public static void main(String[] args) {
        System.out.println("Ex 1");
        //Ex 1. 1. We want to make a row of bricks that is goal inches long.
        // We have a number of small bricks (1 inch each) and big bricks (5 inches each).
        // Return true if it is possible to make the goal by choosing from the given bricks.
        // This is a little harder than it looks and can be done without any loops.
        // See also: Introduction to MakeBricks
        System.out.println(makeBricks(3, 1, 8)); //→ true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(10, 0, 10));// → true
        System.out.println(makeBricks(0, 1, 10));// → false
        System.out.println(makeBricks(5, 1, 10));// → true
        System.out.println(makeBricks(3, 2, 9));// → false
        System.out.println("Ex 2");
        //Верните сумму чисел, исключая 13-19, но 15 и 16 - это обычные числа
        System.out.println(noTeenSum(1, 2, 3));//→ 6
        System.out.println(noTeenSum(2, 13, 1));// → 3
        System.out.println(noTeenSum(2, 1, 14));// → 3

    }

    private static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (13 == a && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        if (b >= 13 && b <= 19 && b != 15 && b != 16) {
            b = 0;
        }
        if (c >= 13 && c <= 14 || c >= 17 && c <= 19) {
            c = 0;
        }
        sum = a + b + c;
        return sum;
    }

    private static boolean makeBricks(int small, int big, int goal) {
        return goal <= small + big * 5 && goal % 5 <= small;
    }
}


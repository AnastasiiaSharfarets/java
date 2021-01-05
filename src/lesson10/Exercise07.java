package lesson10;

public class Exercise07 {
    public static void main(String[] args) {
        //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
        //вернуть истину, если сумма двух из трех чилел, равна третьему числу
        System.out.println(twoAsOne(1, 2, 3)); //→ true
        System.out.println(twoAsOne(3, 1, 2));// → true
        System.out.println(twoAsOne(3, 2, 2));// → false
    }

    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }
}

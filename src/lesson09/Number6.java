package lesson09;

public class Number6 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true
    }

    private static boolean love6(int a, int b) {
        int sum = a + b;
        int dif = Math.abs(a - b);
        return (a == 6 || b == 6) || sum == 6 || dif == 6;

    }

    private static boolean love6Second(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }
}

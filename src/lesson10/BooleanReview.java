package lesson10;

public class BooleanReview {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        boolean logicalExpression = 5 > 7;
        System.out.println(logicalExpression);
    }

    public static boolean booleanExercise() {
        return 5 > 7;
    }

    public static void ifExercise() {
        if (5 > 7) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
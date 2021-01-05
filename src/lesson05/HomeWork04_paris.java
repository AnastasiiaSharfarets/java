package lesson05;

public class HomeWork04_paris {
    public static void main(String[] args) {
        System.out.println(studens(588, 20));
    }

    public static boolean studens(int class1, int class2) {
        int a = class1 + class2;
        boolean result = a <= 25;
        return result;

    }
}

package lesson03;

public class Calculator {
    public static void main(String[] args) {
        //sum();
        additionTwo(5, 8);
        additionTwo(130, 150);
        additionTwo(234, 2134);
        int x = 100;
        int y = 200;
        additionTwo(x, y);
        int test1 = 45;
        test(test1, 56);
    }

    public static void test(double a, double b) {


    }

    public static void additionTwo(int weight, int height) {
        int c = weight + height;
        System.out.println(c);

    }

    public static void additionOne() {
        int a = 3;
        int b = 5;
        int mySum = a + b;
        System.out.println(mySum);
    }
}

package lesson03;

public class HomeWork03_2 {
    public static void main(String[] args) {
        findCircleLength();
        double result = additionOne(90);
        System.out.println(result);
    }

    public static void findCircleLength() {
        int radius = 80;
        final double PI = Math.PI;
        double javaPI = Math.PI;
        double сircleLength = 2 * PI * radius;
        System.out.println("длина окружности " + сircleLength);
    }

    public static double additionOne(int a) {
        final double PI = Math.PI;
        double b = 2 * PI * a;
        System.out.println(b);
        return b;

    }

}

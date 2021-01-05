package lesson03;

public class HappyMath {
    public static void main(String[] args) {
        //exoMath();
        findCircleSquare();
    }

    public static void findCircleSquare() {
        int radius = 10;
        final double PI = 3.14;
        double javaPI = Math.PI;
        //final int MAX_TEMP = 16;
        double squareCircle = PI * radius * radius;
        System.out.println("squareCircle " + squareCircle);
        System.out.println("Пи из мат. библиотеки JAva " + javaPI);
    }

    public static void exoMath() {

        double d1 = 1.0;
        double d2 = 289347329.0;
        double d3 = d1 / d2;
        System.out.println(d3);
    }


}

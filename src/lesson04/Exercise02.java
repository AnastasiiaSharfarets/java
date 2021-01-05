package lesson04;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(giveMeLengthCircle(45.5));
        System.out.println(giveMeLengthCircle(545.3));
        System.out.println(giveMeLengthCircle(788.25));
        giveMeLengthCircle();
    }

    public static double giveMeLengthCircle(double radius) {
        double pi = 3.14;
        double length = 2 * pi * radius;
        return length;

    }

    public static void giveMeLengthCircle() {
        double pi = 3.14;
        double radius = 5;
        double length = 2 * pi * radius;
        System.out.println(length);
    }
}

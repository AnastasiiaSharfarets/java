package lesson04;

public class Exercise01 {
    public static void main(String[] args) {
        // написать программу для вычисления площади круга;
        circleArea();
        System.out.println("результат у клиента " + circleArea(15.5));
    }

    public static double circleArea(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("распечатка для прогера при дебаге " + area);
        return area;

    }

    public static void circleArea() {
        double pi = 3.14;
        double radius = 15.5;
        double area = pi * radius * radius;
        System.out.println(area);

    }
}

package lesson18;

public class GeometryTeacher {
    public static void main(String[] args) {
        double money = amountOfSprayCan() * 17;
        System.out.println(money  + "€");
    }

    private static double amountOfSprayCan() {
        double result = colorAmount() / 400;
        //result = Math.floor(result);// округление в мньншую строну
        result = Math.ceil(result);//округление вверх
        System.out.println("Amount of color " + result);
        return result;
    }

    private static double colorAmount() {
        return giveMeArea() / 10000 * 560;
    }

    private static double giveMeArea() {
        return sphereArea() + cubeArea() + pyramidArea() + boxArea();
    }

    private static double boxArea() {
        int a = 80;
        int b = 30;
        int c = 20;
        return 2 * a * b + 2 * b * c + 2 * c * a;
    }

    private static double pyramidArea() {
        int a = 20;
        int b = 30;
        return a * a + 2 * a * Math.sqrt(b * b - a * a / 4);
    }

    private static double cubeArea() {
        int a = 40;
        return a * a * 6;
    }

    private static double sphereArea() {
        double radius = 58 / 2;
        double result = 4 * Math.PI * radius * radius;
        return result;
    }
}

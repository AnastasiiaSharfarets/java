package lesson26;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        calculator();
        //System.out.println(bmiFinder(56, 1.80));
        //System.out.println(bmiFinder(100, 1.75));

    }

    private static void calculator() {
        double userW = weightFinder();
        double userH = heightFinder();
        System.out.println("Индекс массы тела пользователя: " + bmiFinder(userW, userH));
    }

    private static double weightFinder() {
        double weight;
        System.out.println("Ведите вес пользователя: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        return weight;
    }

    private static double heightFinder() {
        double height;
        System.out.println("Ведите рост пользователя в метрах: ");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        if (height > 100) {
            height = height / 100;// height /=100(разделить с присваиванием на 100)
        }
        return height;
    }

    //вес в кг, рост в метрах
    private static double bmiFinder(double weight, double height) {
        return weight / (height * height);
    }
}

package lesson02;

public class HelloRectangle {
    public static void main(String[] args) {
        //найти площадь и периметр прямоугольника;
        //дам прямоугольник со сторонами 45 и 90;
        findPerimetr();
        findSquare();
    }

    public static void findPerimetr() {
        int a = 45;
        int b = 90;
        int perimetr = 2 * a + 2 * b;
        System.out.println("периметр прямоугольнка равен:" + perimetr);
    }

    public static void findSquare() {
        int a = 45;
        int b = 90;
        int square = a * b;
        System.out.println("площадь прямоугольника равна:" + square);
    }
}

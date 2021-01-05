package lesson02;

public class HelloSquare {
    public static void main(String[] args) {
        //найти площадь и периметр;
        //дан квадрат состороной 5;
        //int = 5;
        findPerimetr();
        findSquare();
    }

    public static void findPerimetr() {
        int a = 5;
        int perimetr = 4 * a;
        System.out.println("периметр квадрата равен:" + perimetr);
    }

    public static void findSquare() {
        int a = 5;
        int square = a * a;
        System.out.println("площадь квадрата равнва:" + square);
    }

}
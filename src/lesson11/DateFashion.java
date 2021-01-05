package lesson11;

import lesson04.Exercise01;

public class DateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));// → 2
        System.out.println(dateFashion(5, 2));// → 0
        System.out.println(dateFashion(5, 5));// → 1
    }

    private static int dateFashion(int you, int yourDate) {
        if (you >= 8 && yourDate > 2 || yourDate >= 8 && you > 2) {
            return 2;
        } else if (you <= 2 || yourDate <= 2) {
            return 0;
        }else {
            return 1;
        }
    }
}

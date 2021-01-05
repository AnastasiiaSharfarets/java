package lesson10;

public class Homework02 {
    public static void main(String[] args) {
        //верните число в радиусе 2 от числа кратного 10
        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
    }

    private static boolean nearTen(int num) {
        int temp = num % 10;//интересуют остатки 8,9,0,1,2
        return temp <= 2 || temp >= 8;
    }
}

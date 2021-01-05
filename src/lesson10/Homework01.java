package lesson10;

public class Homework01 {
    public static void main(String[] args) {
//Верните true, если заданное неотрицательное число на 1 или 2 больше, чем кратное 20.
        System.out.println(more20(20));// → false
        System.out.println(more20(21));//→ true
        System.out.println(more20(22));// →true
        System.out.println(more20(85));//false
        System.out.println(more20(101));//true
    }

    private static boolean more20(int number) {
        int temp = number % 20;// остаток от 0 до 19
        //if (temp - 1 == 0 || temp - 2 == 0)
        // if (temp == 1 || temp == 2) {
        //   return true;
        //} else {
        //  return false;
        // }
        return temp > 0 && temp < 3;
    }
}

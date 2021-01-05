package lesson05;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true));// false
        System.out.println(doorbell(false, false));// false
        System.out.println(doorbell(true, false));// true;

    }

    public static boolean doorbell(boolean bell1, boolean bell2) {
        return bell1 ^ bell2;
        //return !(bell1 == bell2);

    }
}

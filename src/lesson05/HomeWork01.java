package lesson05;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true)); // ->true
        System.out.println(bigBadaBoom(false, false));  // ->false
        System.out.println(bigBadaBoom(true, false)); // ->false
    }


    public static boolean bigBadaBoom(boolean officer1, boolean officer2) {
        boolean result = officer1 && officer2;
        return result;
    }
}

package lesson05;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println(smartDoorCheckKey(true, true));
        System.out.println(smartDoorCheckKey(true, false));
        System.out.println(smartDoorCheckKey(false, false));
        System.out.println(smartDoorCheckKey(false, true));
    }

    public static boolean smartDoorCheckKey(boolean internet, boolean electricity) {
        return internet && electricity;


    }
}

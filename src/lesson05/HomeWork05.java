package lesson05;

public class HomeWork05 {
    public static void main(String[] args) {
        System.out.println(verySmartDoor(false, true, false));// true
        System.out.println(verySmartDoor(false, false, true));// true
        System.out.println(verySmartDoor(true, false, false));// true
        System.out.println(verySmartDoor(false, false, false));//false
        System.out.println(verySmartDoor(true, true, true));//true
        System.out.println(verySmartDoor(true, true, false));//true
        System.out.println(verySmartDoor(true, false, true));//true
        System.out.println(verySmartDoor(false, true, true));//true
        split();
        System.out.println(doNotOpen(false, false, false));
    }


    public static boolean verySmartDoor(boolean phone, boolean fingerprint, boolean password) {
        boolean result = phone || fingerprint || password;
        return result;
    }

    private static void split() {
        System.out.println("________________");

    }

    public static boolean doNotOpen(boolean phone, boolean fingerprint, boolean password) {
        boolean result = phone || fingerprint || password;
        return result;

    }
}

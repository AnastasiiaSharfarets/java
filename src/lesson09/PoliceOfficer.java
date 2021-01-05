package lesson09;

public class PoliceOfficer {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));//0
        System.out.println(caughtSpeeding(81, false));//2
        System.out.println(caughtSpeeding(81, true));//1
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        int output;
        if (speed <= 60) {
            output = 0;
        } else if (speed <= 80) {
            output = 1;
        } else {
            output = 2;
        }
        return output;

    }
}

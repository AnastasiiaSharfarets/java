package lesson20;

public class HolidayHomeworkLogic {
    public static void main(String[] args) {
        //Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
        // such as the 2 in 12 and 23.
        // (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false
        System.out.println(shareDigit(9, 904));// → false
        System.out.println();
        //The squirrels in Palo Alto spend most of the day playing.
        // In particular, they play if the temperature is between 60 and 90 (inclusive).
        // Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer,
        // return true if the squirrels play and false otherwise.
        System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));//→ false
        System.out.println(squirrelPlay(95, true));//→ true
        System.out.println();
        //Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
        // return a string of the form "7:00" indicating when the alarm clock should ring.
        // Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
        // Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
        System.out.println(alarmClock(1, false));//→"7:00"
        System.out.println(alarmClock(5, false));//→"7:00"
        System.out.println(alarmClock(0, false));//→"10:00"
        System.out.println(alarmClock(0, true));//→"OFF"
        System.out.println();
        //We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
        // Return true if the given non- negative number is special.
        // Use the % "mod" operator -- see Introduction to Mod
        System.out.println(specialEleven(22));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false
        System.out.println();
        //Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
        // So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
        System.out.println(less20(38));// → true
        System.out.println(less20(39));// → true
        System.out.println(less20(40));// → false
    }

    private static boolean less20(int number) {
        return number % 20 == 18 || number % 20 == 19;
    }

    private static boolean specialEleven(int number) {
        return number % 11 == 0 || number % 11 == 1;
    }

    private static String alarmClock(int dayOfWeek, boolean isVacation) {
        if ((dayOfWeek == 0 || dayOfWeek == 6) && !isVacation) {
            return "10:00";
        } else if (isVacation && (dayOfWeek == 0 || dayOfWeek == 6)) {
            return "OFF";
        } else if (isVacation) {
            return "10:00";
        } else return "7:00";

    }

    private static boolean squirrelPlay(int temperature, boolean isSummer) {
        return (temperature >= 60 && temperature <= 90 && !isSummer) ||
                (isSummer && temperature >= 60 && temperature <= 100);
    }

    private static boolean shareDigit(int a, int b) {
        int rightDigitA = a % 10;
        int leftDigitA = (a / 10) % 10;
        int rightDigitB = b % 10;
        int leftDigitB = (b / 10) % 10;
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            return rightDigitA == rightDigitB || leftDigitA == leftDigitB ||
                    rightDigitA == leftDigitB || leftDigitA == rightDigitB;
        } else
            return false;
    }

}

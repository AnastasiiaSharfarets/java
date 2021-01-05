package lesson05;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); //true
        System.out.println(smartDepositBox(false, true)); //true
        System.out.println(smartDepositBox(false, false)); // false
        split();
        System.out.println("smartDepositBowVersionTwo");
        System.out.println(smartDepositBoxVersionTwo(true, false));//false
        System.out.println(smartDepositBoxVersionTwo(false, true)); //false
        System.out.println(smartDepositBoxVersionTwo(false, false));//false
        System.out.println(smartDepositBoxVersionTwo(true, true));//true
        split();
        System.out.println(verySmartDepositBoxVersionThree(true, true, false));
        System.out.println(verySmartDepositBoxVersionThree(true, true, true));
        System.out.println(verySmartDepositBoxVersionThree(false, true, true));
        System.out.println(verySmartDepositBoxVersionThree(true, false, false));
        split();
        System.out.println(verySmartDepositBoxVersionThree(false,false,true));


    }

    public static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    private static void split() {
        System.out.println("________________");

    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama || papa;

    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean oma) {
        boolean parents = mama && papa;
        boolean result = parents || oma;
        return result;
//return (mama&&papa)||oma;
    }

    public static boolean verySmartDepositBoxVersionTree
            (boolean mama, boolean papa, boolean oma) {
        return smartDepositBoxVersionTwo(mama, papa) || oma;
    }
}

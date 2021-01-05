package lesson11;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21
        split();
        System.out.println("задача intTo10 дает результат " + in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
        split();
        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
        split();
        System.out.println(teenSum(3, 4)); //→ 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19
    }

    private static int teenSum(int a, int b) {
        if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
            return 19;
        } else
            return a + b;


    }


    private static boolean old35(int number) {
        /*if(number%15==0){
        return false;
    }else if (number%5==0){
        return true;
        } eise if (number%3==0){
        return true;
        } return false;

*/
        return number % 3 == 0 ^ number % 5 == 0;
    }

    //"задача intTo10 дает результат"
    private static boolean in1To10(int n, boolean outsideMode) {
        //n <= 1 || n >= 10 && outsideMode|| n>=1&& n<=10 &&!outsideMode;
        if (n <= 1 || n >= 10 && outsideMode) {
            return true;
        } else if (n <= 10 && !outsideMode) {
            return true;
        }

        return false;
    }


    public static void split() {
        System.out.println("_______________");
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }
}

package lesson20;

public class EndingRublesTwo {
    public static void main(String[] args) {
        //printSumInRub(0,2);
        System.out.println(rightEnding(821));
    }

    private static String rightEnding(int number) {
        int lastDigit = number % 10;
        int prelastDigit = (number / 10) % 10;
        if (prelastDigit == 1) {
            return number + " рублей";
        } else {
            if (lastDigit == 1) {
                return number + " рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                return number + " рубля";
            } else {
                return number + " рублей";
            }
        }
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(rightEnding(i));
        }
    }

}

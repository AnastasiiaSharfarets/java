package lesson15;

public class Exercise12 {
    public static void main(String[] args) {
        countdownWhile(10);
        printLineNTimesWhile("JA", 3);
        System.out.println();
        System.out.println(printLineNTimesStringWhile("WOW", 9));
//        printLineNTimes("Hello", 3);
//        System.out.println();
//        printLineNTimes("Java", 5);
//        System.out.println();
//        System.out.println(printLineNTimesString("Frontend", 2));
//        countdown(5);
//        System.out.println();
//        System.out.println(digitPowTwo(5));
//        System.out.println(digitPowTwo(10));
//        System.out.println(digitPowTwo(4));
//        System.out.println(digitPowTwo(6));

    }

    public static int digitPowTwo(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number; // result+= number
        }
        return result;
    }

    public static void countdown(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("start");
    }

    public static void countdownWhile(int number) {
        int i = number;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.print("start");
    }


    public static String printLineNTimesString(String word, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static String printLineNTimesStringWhile(String word, int number) {
        String result = "";
        int counter = 0;
        while (counter < number) {
            result = result + word + " ";
            counter++;
        }
        return result;
    }

    public static void printLineNTimes(String word, int number) {
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(word + " ");
        }
    }

    public static void printLineNTimesWhile(String word, int number) {
        System.out.println();
        int i = 0;
        while (i < number) {
            System.out.print(word + " ");
            i++;
        }
    }
}


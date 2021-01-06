package lesson22;

import java.util.Arrays;

public class Homework22 {
    public static void main(String[] args) {
        //create random double array with size = 10;
        // insert new element on specific index into array
        // update one element on specific index.
        // delete one element on specific index.
        // print the array with magic color.
        double[] a = randomArray(10);
        double element = 88.88;
        int index = 0;
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(insertSpecificElement(a, element, index)));
        System.out.println(Arrays.toString(updateSpecificElement(a, element, index)));
        System.out.println(Arrays.toString(deleteElement(a, index)));
        printArrayWithMagicColor(randomArray(10));
    }

    public static void printArrayWithMagicColor(double[] a) {
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_MAGENTA = "\033[35m";
        final String ANSI_DARKCYAN = "\033[36m";
        System.out.println(ANSI_BLACK + "[" +
                ANSI_BLACK + a[0] + ANSI_BLACK + ", " +
                ANSI_RED + a[1] + ANSI_BLACK + ", " +
                ANSI_GREEN + a[2] + ANSI_BLACK + ", " +
                ANSI_YELLOW + a[3] + ANSI_BLACK + ", " +
                ANSI_BLUE + a[4] + ANSI_BLACK + ", " +
                ANSI_PURPLE + a[5] + ANSI_BLACK + ", " +
                ANSI_CYAN + a[6] + ANSI_BLACK + ", " +
                ANSI_WHITE + a[7] + ANSI_BLACK + ", " +
                ANSI_MAGENTA + a[8] + ANSI_BLACK + ", " +
                ANSI_DARKCYAN + a[9] + ANSI_BLACK + "]");
    }

    public static double[] deleteElement(double[] input, int index) {
        double[] output = new double[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = input[i + 1];
        }
        return output;
    }

    public static double[] updateSpecificElement(double[] input, double element, int index) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[index] = element;
        return output;
    }

    public static double[] insertSpecificElement(double[] input, double element, int index) {
        double[] output = new double[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    public static double[] randomArray(int size) {
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            output[i] = randomElement();
        }
        return output;
    }

    public static double randomElement() {
        double randomElement = Math.random() * 10000;
        int temp = (int) (randomElement);
        double temp2 = temp;
        return temp2 / 100;
    }
}

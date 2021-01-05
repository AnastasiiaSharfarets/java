package lesson21;

import java.util.Arrays;

public class Homework21 {


    public static void main(String[] args) {
        //Ex.8. Given an array of ints of odd(нечетный) length,
        // return a new array length 3 containing the elements from the middle of the array.
        // The array length will be at least 3.
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};

        myColourPrintArray();

    }

    public static void myColorPrintIntArray(int[] input) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        System.out.print(ANSI_GREEN_BACKGROUND + ANSI_YELLOW + "[");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println(input[input.length - 1] + "]" + ANSI_RESET);
    }

    public static void myColourPrintArray() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + Arrays.toString(midThree(a1)) + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_YELLOW + Arrays.toString(midThree(a2)) + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLUE + Arrays.toString(midThree(a3)) + ANSI_RESET);
    }

    public static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }
}

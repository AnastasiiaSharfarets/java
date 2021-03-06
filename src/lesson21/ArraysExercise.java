package lesson21;

import lesson20.Main;

public class ArraysExercise {
    public static void main(String[] args) {
        //Ex.6. Given an int array length 3, if there is a 2 in the array
        // immediately followed by a 3, set the 3 element to 0.
        // Return the changed array.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 3, 5};
        int[] a3 = new int[]{1, 2, 1};

        Main.printArrayForEach(fix23(a1));//→ [1, 2, 0]
        Main.printArrayForEach(fix23(a2));//→ [2, 0, 5]
        Main.printArrayForEach(fix23(a3));//→ [1, 2, 1]
        System.out.println();

        //Ex.7. Given an array of ints of even(четный) length,
        // return a new array length 2 containing
        // the middle two elements from the original array.
        // The original array will be length 2 or more.
        int[] a4 = new int[]{1, 2, 3, 4};
        int[] a5 = new int[]{7, 1, 2, 3, 4, 9};
        int[] a6 = new int[]{1, 2};

        Main.printArrayForEach(makeMiddle(a1)); //→ [2, 3]
        Main.printArrayForEach(makeMiddle(a2)); //→ [2, 3]
        Main.printArrayForEach(makeMiddle(a3)); //→ [1, 2]
    }

    public static int[] makeMiddle(int[] input) {
        int[] output = new int[2];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        return output;
    }

    private static int[] fix23(int[] input) {
        if (input[0] == 2 && input[1] == 3) {
            input[1] = 0;
        } else if (input[1] == 2 && input[2] == 3) {
            input[2] = 0;
        }
        return input;
    }
}

package lesson19;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 6};
        int[] array2 = new int[]{6, 1, 2, 4};
        int[] array3 = new int[]{13, 6, 1, 2, 3};

        System.out.println(firstLast6(array1));// → true
        System.out.println(firstLast6(array2));// → true
        System.out.println(firstLast6(array3));// → false
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{7, 3};
        int[] array6 = new int[]{7, 3, 2};
        int[] array7 = new int[]{1, 3};

        System.out.println(commonEnd(array4, array5));// →true
        System.out.println(commonEnd(array4, array6));// →false
        System.out.println(commonEnd(array4, array7));// →true

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};

        System.out.println(Arrays.toString(reverse3(a1)));// → [3, 2, 1]
        System.out.println(Arrays.toString(reverse3(a2)));// → [9, 11, 5]
        System.out.println(Arrays.toString(reverse3(a3)));// → [0, 0, 7]

    }

    private static int[] reverse3(int[] array) {
        int[] output = new int[3];
        output[0] = array[2];
        output[1] = array[1];
        output[2] = array[0];
        return output;
    }

    private static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    private static boolean firstLast6(int[] input) {
        if (input[0] == 6 || input[input.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}


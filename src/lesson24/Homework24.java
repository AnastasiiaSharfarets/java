package lesson24;

import java.util.Arrays;

public class Homework24 {
    public static void main(String[] args) {
        //Ex.16 Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        int[] arr3 = new int[]{4, 4};
        int[] arr4 = new int[]{2, 2};
        int[] arr5 = new int[]{9, 2};
        int[] arr6 = new int[]{3, 4};
        System.out.println("Ex.16");
        System.out.println(Arrays.toString(plusTwo(arr1, arr2)));//→ [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwo(arr3, arr4)));//→ [4, 4, 2, 2]
        System.out.println(Arrays.toString(plusTwo(arr5, arr6)));//→ [9, 2, 3, 4]

        //Ex.17 Given an array of ints of odd length,
        // look at the first, last, and middle values in the array and return the largest. The array
        //length will be a least 1.
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 5, 3};
        int[] array3 = new int[]{5, 2, 3, 1, -3};
        System.out.println("Ex.17");
        System.out.println(maxTriple(array1));//→ 3
        System.out.println(maxTriple(array2));//→ 5
        System.out.println(maxTriple(array3));//→ 5

        //Ex.18 Given 2 int arrays, a and b, return a new array length 2 containing,
        // as much as will fit, the elements from a followed by the
        //elements from b. The arrays may be any length, including 0,
        // but there will be 2 or more elements available between the 2 arrays.
        int[] a1 = new int[]{4, 5};
        int[] b1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4};
        int[] b2 = new int[]{1, 2, 3};
        int[] a3 = new int[0];
        int[] b3 = new int[]{1, 2};
        System.out.println("Ex.18");
        System.out.println(Arrays.toString(make2(a1, b1)));//→ [4, 5]
        System.out.println(Arrays.toString(make2(a2, b2)));//→ [4, 1]
        System.out.println(Arrays.toString(make2(a3, b3)));//→ [1, 2]

    }

    private static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length > 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else {
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i];
            }
            for (int i = a.length; i < 2; i++) {
                result[i] = b[i - a.length];
            }
        }
        return result;
    }

    private static int maxTriple(int[] array) {
        int maxElement;
        maxElement = Math.max(array[0], array[array.length / 2]);
        maxElement = Math.max(maxElement, array[array.length - 1]);
        return maxElement;

    }

    private static int[] plusTwo(int[] arrayA, int[] arrayB) {
        int[] output = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++) {
            output[i] = arrayA[i];
        }
        for (int i = arrayA.length; i < output.length; i++) {
            output[i] = arrayB[i - arrayA.length];
        }
        return output;
    }
}

package lesson23;

import java.util.Arrays;

public class Homework23 {
    public static void main(String[] args) {
        //Ex12. Given an array of ints length 3, figure out which is larger,
        // the first or last element in the array, and set all the other elements to be that value. Return the changed array.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        int[] arr4 = new int[]{2, 11, 3, 9};
        System.out.println("Вывод массива, где все элементы равны большему из первого и последнего элемента: ");
        System.out.println(Arrays.toString(maxEnd3(arr1)));//→ [3, 3, 3]
        System.out.println(Arrays.toString(maxEnd3(arr2)));//→ [11, 11, 11]
        System.out.println(Arrays.toString(maxEnd3(arr3)));//→ [3, 3, 3]
        System.out.println(Arrays.toString(maxEnd3(arr4)));//→ [9, 9, 9]
        System.out.println();

        //Ex.13 Given an array of ints, return a new array length 2 containing
        // the first and last elements from the original array. The original array will be length 1 or more.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 3, 4};
        int[] a3 = new int[]{7, 4, 6, 2};
        System.out.println("Вывод массива длиной 2 с первый и последним элементом из исходного массива: ");
        System.out.println(Arrays.toString(makeEnds(a1)));// → [1, 3]
        System.out.println(Arrays.toString(makeEnds(a2)));//→ [1, 4]
        System.out.println(Arrays.toString(makeEnds(a3)));//→ [7, 2]
        System.out.println();

        //Ex.14 Given an int array, return a new array with double the length
        // where its last element is the same as the original array, and all the other elements are 0.
        // The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
        int[] array1 = new int[]{4, 5, 6};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{3};
        System.out.println("Вывод удвоенного массива, где все элементы 0, кроме последнего(не изменялся): ");
        System.out.println(Arrays.toString(makeLast(array1))); //→ [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(makeLast(array2)));// → [0, 0, 0, 2]
        System.out.println(Arrays.toString(makeLast(array3)));// → [0, 3]
    }

    private static int[] makeLast(int[] array) {
        int[] result = new int[array.length * 2];
        result[result.length - 1] = array[array.length - 1];
        return result;
    }

    private static int[] makeEnds(int[] a) {
        int[] result;
        result = new int[]{a[0], a[a.length - 1]};
        return result;
    }

    private static int[] maxEnd3(int[] input) {
        int[] output = new int[3];
        if (input[0] > input[input.length - 1]) {
            output[0] = input[0];
            output[1] = input[0];
            output[2] = input[0];
            return output; //= new int[]{input[0], input[0], input[0]};
        } else if (input[input.length - 1] > input[0]) {
            output[0] = input[input.length - 1];
            output[1] = input[input.length - 1];
            output[2] = input[input.length - 1];
            return output; //= new int[]{input[input.length - 1], input[input.length - 1], input[input.length - 1]};
        }
        return input;
    }

}


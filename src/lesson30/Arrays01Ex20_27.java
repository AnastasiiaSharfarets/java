package lesson30;

import java.util.Arrays;

public class Arrays01Ex20_27 {
    public static void main(String[] args) {
        //Ex.20 Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{5, 11, 9};
        int[] c = new int[]{7, 0, 0};
        System.out.println(Arrays.toString(rotateLeft3(a)));//→ [2, 3, 1]
        System.out.println(Arrays.toString(rotateLeft3(b)));//→ [11, 9, 5]
        System.out.println(Arrays.toString(rotateLeft3(c)));//→ [0, 0, 7]

        //Ex.21  Given an array of ints, return the sum of the first 2 elements in the array.
        // If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 1};
        int[] a3 = new int[]{1, 1, 1, 1};
        int[] a4 = new int[0];
        System.out.println(sum2(a1));// →3
        System.out.println(sum2(a2));// →2
        System.out.println(sum2(a3));// →2
        System.out.println(sum2(a4));// →0

        //Ex.22 Given an int array length 2, return true if it contains a 2 or a 3.
        int[] arr1 = new int[]{2, 5};
        int[] arr2 = new int[]{4, 3};
        int[] arr3 = new int[]{4, 5};
        System.out.println(has23(arr1));// →true
        System.out.println(has23(arr2));// →true
        System.out.println(has23(arr3));// →false

        //Ex.23 Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
        int[] ar1 = new int[]{2, 2};
        int[] ar2 = new int[]{3, 3};
        int[] ar3 = new int[]{2, 3};
        int[] ar4 = new int[]{2};
        int[] ar5 = new int[0];
        System.out.println(double23(ar1));//→true
        System.out.println(double23(ar2));// →true
        System.out.println(double23(ar3));// →false
        System.out.println(double23(ar4));// →false
        System.out.println(double23(ar5));// →false

        //Ex.24 Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
        // Return the array which has the largest sum. In event of a tie(в случае ничьей), return a.
        int[] A = new int[]{1, 2};
        int[] B = new int[]{3, 4};
        int[] A1 = new int[]{3, 4};
        int[] B1 = new int[]{1, 2};
        int[] A2 = new int[]{1, 1};
        int[] B2 = new int[]{0, 2};

        int[] A3 = new int[]{0, 2, 2};
        int[] B3 = new int[]{0, 2, 4};
        System.out.println(Arrays.toString(biggerTwo(A, B)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(A1, B1)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(A2, B2)));// → [1, 1]

        System.out.println(Arrays.toString(biggerTwoAnyLength(A3, B3)));// → [0, 2, 4]

        //Ex.25 Given an array of ints, swap(поменять) the first and last elements in the array.
        // Return the modified array. The array length will be at least 1.
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = new int[]{8, 6, 7, 9, 5};
        System.out.println(Arrays.toString(swapEnds(array1)));// → [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapEnds(array2)));// → [3, 2, 1]
        System.out.println(Arrays.toString(swapEnds(array3)));// → [5, 6, 7, 9, 8]

        //Ex.26 Given an int array of any length, return a new array of its first 2 elements.
        // If the array is smaller than length 2, use whatever elements are present.
        int[] d = new int[]{1, 2, 3};
        int[] e = new int[]{1, 2};
        int[] f = new int[]{1};
        int[] g = new int[0];
        System.out.println(Arrays.toString(frontPiece(d)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(e)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(f)));// → [1]
        System.out.println(Arrays.toString(frontPiece(g)));// → []

        //Ex.27 Given 2 int arrays, aa and bb, of any length, return
        // a new array with the first element of each array. If either array is length 0, ignore that array.
        int[] aa = new int[]{1, 2, 3};
        int[] bb = new int[]{7, 8, 9};
        int[] aa1 = new int[]{1};
        int[] bb1 = new int[]{2};
        int[] aa2 = new int[]{1, 7};
        int[] bb2 = new int[0];
        int[] aa0 = new int[0];
        System.out.println(Arrays.toString(front11(aa, bb)));// → [1, 7]
        System.out.println(Arrays.toString(front11(aa1, bb1)));// → [1, 2]
        System.out.println(Arrays.toString(front11(aa2, bb2)));// → [1]
        System.out.println(Arrays.toString(front11(aa0, bb2)));// → []

    }

    private static int[] front11(int[] a, int[] b) {
        int[] newArr;
        if (a.length == 0 && b.length == 0) {
            newArr = new int[0];//1
        } else if (a.length == 0) {
            newArr = new int[]{b[0]};//2
        } else if (b.length == 0) {
            newArr = new int[]{a[0]};//3
        } else {
            newArr = new int[]{a[0], b[0]};//4
        }
        return newArr;

    }

    private static int[] frontPiece(int[] input) {
        int[] result = new int[2];
        if (input.length == 1) {
            return input;
        }
        if (input.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < 2; i++) {
            result[i] = input[i];
        }
        return result;
    }

    private static int[] swapEnds(int[] input) {
        int[] result = new int[input.length];
        if (input.length > 1) {
            result[0] = input[input.length - 1];
            result[result.length - 1] = input[0];
            for (int i = 1; i < input.length - 1; i++) {
                result[i] = input[i];
            }
            return result;
        } else return input;
    }

    private static int[] biggerTwoAnyLength(int[] a, int[] b) {
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < a.length; i++) {
            aSum += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            bSum += b[i];
        }
        return aSum >= bSum ? a : b;
    }

    private static int[] biggerTwo(int[] input1, int[] input2) {
        //только для массивов длиной 2
        if (input1[0] + input1[1] >= input2[0] + input2[1]) {
            return input1;
        } else
            return input2;
    }

    private static boolean double23(int[] input) {
        if (input.length >= 2) {
            int count2 = 0;
            int count3 = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == 2) {
                    count2++;
                }
                if (input[i] == 3) {
                    count3++;
                }
            }
            return count2 == 2 || count3 == 2;
        }
        return false;
    }

    private static boolean has23(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 2 || input[i] == 3) {
                return true;
            }
        }
        return false;
    }

    private static int sum2(int[] input) {
        if (input.length < 2) {
            if (input.length == 1) {
                return input[0];
            } else return 0;
        }
        return input[0] + input[1];
    }

    private static int[] rotateLeft3(int[] input) {
        int[] result = new int[3];
        result[0] = input[1];
        result[1] = input[2];
        result[2] = input[0];
        return result;
    }

}

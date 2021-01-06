package lesson22;

import java.util.Arrays;

public class ArrayExc {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 5, 10};
        int[] var2 = new int[]{6, 7, 9};
        System.out.println(Arrays.toString(arrayConcatenation(var1, var2)));
        System.out.println(Arrays.toString(arrayElementSum(var1, var2)));
    }

    public static int[] arrayElementSum(int[] a, int[] b) {
        int length = 0;
        if (a.length > b.length) {
            length = a.length;
        } else {
            length = b.length;
        }
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            output[i] = a[i] + b[i];
        }
        return output;
    }

    public static int[] arrayConcatenation(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = a.length; i < output.length; i++) {
            output[i] = b[i - a.length];
        }
        return output;
    }
}

package lesson22;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        //добавить x на первое место, остальное сдвинуть
        int[] arr = new int[]{5, 7, 8, 1, 3};
        int x = 99;
        int index = arr.length / 2;
        //int[] var1 = insertFirstElement(arr, x);
        //Main.printArrayForEach(var1);
        //Main.printArrayForEach(insertFirstElement(arr, x));
        //System.out.println(Arrays.toString(insertFirstElement(arr, x)));
        //Main.printArrayForEach(insertLastElement(arr, x));
        //System.out.println(Arrays.toString(insertLastElement(arr, x)));
        //System.out.println(Arrays.toString(insertSpecificElement(arr, x, index)));
        System.out.println(Arrays.toString(updateSpecificElement(arr, x, index)));
        //System.out.println(Arrays.toString(deleteElement(arr, index)));
    }

    public static int[] deleteElement(int[] input, int index) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = input[i + 1];
        }
        return output;
    }

    public static int[] updateSpecificElement(int[] input, int element, int index) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[index] = element;
        return output;
    }

    public static int[] insertSpecificElement(int[] input, int element, int index) {
        int[] output = new int[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    public static int[] insertFirstElement(int[] input, int element) {
        int[] output = new int[input.length + 1];
        output[0] = element;
        for (int i = 0; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        //Main.printArrayForEach(output);
        return output;
    }

    public static int[] insertLastElement(int[] input, int element) {
        int[] output = new int[input.length + 1];
        output[output.length - 1] = element;
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }
}

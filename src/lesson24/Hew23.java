package lesson24;

import java.util.Arrays;

public class Hew23 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        System.out.println(Arrays.toString(makeEnds(arr1)));
        System.out.println(Arrays.toString(makeEnds(arr2)));
        System.out.println(Arrays.toString(makeEnds(arr3)));
    }

    public static int[] makeLast(int[] arr) {
        int[] result = new int[arr.length * 2];
        result[result.length - 1] = arr[arr.length - 1];
        return result;
    }

    public static int[] makeEnds(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[array.length - 1];
        return result;
    }

    public static int[] maxEnd3(int[] array) {
        int[] output = new int[array.length];
        int maxElement;
        //вариант 1
        maxElement = Math.max(array[0], array[array.length - 1]);
        //вариант 2
        maxElement = array[0];
        if (array[array.length - 1] > array[0]) {
            maxElement = array[2];
        } else {
            maxElement = array[0];
        }
        //вариант 3
        maxElement = (array[2] > array[0]) ? array[2] : array[0];

        //первый вариант
        output[0] = maxElement;
        output[1] = maxElement;
        output[2] = maxElement;

        //второй вариант
        for (int i = 0; i < array.length; i++) {
            output[i] = maxElement;
        }
        return output;

    }
}
/* if (условие){
    number=10;
    }else{
    number= -10;
}
number = (условие): ? 10:-10
 */
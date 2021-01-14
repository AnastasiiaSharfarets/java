package lesson29;

import java.util.Arrays;

public class MyLovelySort {
    public static void main(String[] args) {
        //exampleLink();
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 1000, 7, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void exampleLink() {
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 1000, 7, 4};
        bubbleSort(arr);
        int[] barr = arr;
        System.out.println(Arrays.toString(barr));
        barr[0] = 500;
        System.out.println(Arrays.toString(barr));
        System.out.println(Arrays.toString(arr));
        int a = 5;
        int b = a;
        a = 7;
        System.out.println(b);
    }

    private static void bubbleSort(int[] input) {
        //boolean swap;//=обмен
        //boolean unsorted = true;
        int count = 1;
        while (count > 0) {//while(unsorted)
            count = 0;// unsorted =  false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;//unsorted = true;
                }
            }
            if (count > 0) {
                //todo ничего не понятно, надо прописать код
            }
        }
    }
}

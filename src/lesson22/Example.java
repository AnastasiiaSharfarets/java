package lesson22;

import lesson20.Main;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] array = generateIntArray();
        Main.printArrayForEach(generateIntArray());
        System.out.println(Arrays.toString(generateIntArray()));
    }

    private static int[] generateIntArray() {
        int randomLength = randomGenerate(25);
        //System.out.println(randomLength);
        int[] output = new int[randomLength];
        //myColourPrintArray.print(output);
        for (int i = 0; i < output.length; i++) {
            output[i] = randomGenerate(25);//редудантность-повторение

        }
        return output;
    }

    private static int randomGenerate(int size) {
        int myValue = (int) (Math.random() * size);
        if (myValue < 5) {
            myValue = 4;
        }
        return myValue;

    }
}




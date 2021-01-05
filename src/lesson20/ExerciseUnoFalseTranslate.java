package lesson20;

public class ExerciseUnoFalseTranslate {
    public static void main(String[] args) {
        //Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2,
        // содержащего среднее арифметическое элементов первоначальных массивов.
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 7, 7};
        int[] a3 = new int[]{5, 2, 9};
        int[] b1 = new int[]{4, 5, 6};
        int[] b2 = new int[]{3, 8, 0};
        int[] b3 = new int[]{1, 4, 5};
        Main.printArrayForEach(middleWay(a1, b1));// → [2, 5]
        Main.printArrayForEach(middleWay(a2, b2));// → [7, 8]
        Main.printArrayForEach(middleWay(a3, b3));//→ [2, 4]
    }

    private static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        // Arithmetic mean
        result[0] = arithmeticMean(a);
        result[1] = arithmeticMean(b);
        return result;
    }

    private static int arithmeticMean(int[] input) {
        int sum = 0;
        int count = input.length;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum / count;
    }
}

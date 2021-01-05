package lesson19;

import java.util.Arrays;

public class HomeworkArray {
    public static void main(String[] args) {
        //1. Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
        //2. Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        // Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
        int[] numbers = createRandomArray(10);
        System.out.println(Arrays.toString(numbers));
        int maxNumber = findMax(numbers);
        System.out.println(maxNumber);
        int minNumber = findMin(numbers);
        System.out.println(minNumber);
        int average = findAverage(numbers);
        System.out.println(average);
        findPrime(numbers);
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void findPrime(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private static int findAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum / numbers.length;
    }

    private static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    private static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static int[] createRandomArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}

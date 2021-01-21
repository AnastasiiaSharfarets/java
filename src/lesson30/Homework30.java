package lesson30;

import java.util.Arrays;

import static lesson12.MyColor.*;

public class Homework30 {
    public static void main(String[] args) {
        //Создать массив с десятичными дробями. - >> createRandomDoubleArray(10);
        //Вывести его на экран. - >> printColorDoubleArray()
        //Отсортировать его по возрастанию. -->> bubbleSortDoubleArray();
        //Добавить один элемент в массив. -- >> addElementDoubleArray(5, 3.14)
        //Удалить один элемент из массива -- >> deleteElementDoubleArray(3)
        //Изменить один элемент в массиве -- >> updateElementDoubleArray(2, 7.77)
        //Перезаписать/заполнить все элементы массива новыми значениями -->> fillArray();
        System.out.println(Arrays.toString(createRandomDoubleArray(10)));
        printColorDoubleArray(createRandomDoubleArray(10));
        double[] array = createRandomDoubleArray(10);
        bubbleSortDoubleArray(array);
        System.out.println(ANSI_PURPLE + "Print sorted double array ");
        System.out.println(ANSI_CYAN + Arrays.toString(array) + ANSI_RESET);
        System.out.println("Print double array with one added element");
        System.out.println(Arrays.toString(addElementDoubleArray(array, 5, 3.14)));
        System.out.println("Print double array without one deleted element ");
        System.out.println(Arrays.toString(deleteElementDoubleArray(array, 3)));
        System.out.println("Print double array with one changed element");
        System.out.println(Arrays.toString(updateElementDoubleArray(array, 2, 7.77)));
        printColorDoubleArray(fillArray(array));
    }

    private static double[] fillArray(double[] array) {
        double[] newArray = createRandomDoubleArray(array.length);
        return  newArray;
    }

    private static double[] updateElementDoubleArray(double[] array, int index, double newElement) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newElement;
        for (int i = index + 1; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private static double[] deleteElementDoubleArray(double[] array, int index) {
        double[] newArray = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i <= newArray.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

    private static double[] addElementDoubleArray(double[] array, int index, double newItem) {
        //newItem = 3.14;
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newItem;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }

    private static void bubbleSortDoubleArray(double[] input) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    double temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }
            }
        }
    }

    private static double[] createRandomDoubleArray(int size) {
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            //output[i] = Math.random() * 100;
            int magicInt = (int) (Math.random() * 10000);
            output[i] = (double) magicInt / 100;
        }
        return output;
    }

    private static void printColorDoubleArray(double[] input) {
        input = createRandomDoubleArray(10);
        System.out.println(ANSI_RED + "Print colour double array ");
        System.out.print("[");
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(ANSI_GREEN + input[i] + ", ");
        }
        for (int i = input.length - 1; i < input.length; i++) {
            System.out.print(ANSI_GREEN + input[i]);
        }
        System.out.print(ANSI_RED + "]");
        System.out.println();

    }
}

package lesson25;

import java.util.Arrays;

public class MultyArrays {
    public static void main(String[] args) {
        int[][][][] myLovelyArr = new int[5][][][];
        //intro();
        //intro2();
        //intro3();
        //intro4();
        intro5();
    }

    private static void intro5() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String myTestString = Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void intro4() {
        int[][] example = {// несимметричный массив
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
        };
        printTwoIntArray(example);
    }

    private static void printTwoIntArray(int[][] input) {
        for (int[] myLineArray : input) {
            for (int lineElement : myLineArray) {
                System.out.print(lineElement + " ");
            }
            System.out.println();
        }
    }

    private static void intro3() {
        int[][] var = new int[5][]; //двумерный массив с заданными пятью строками
        var[0] = new int[1];
        var[1] = new int[2];
        var[2] = new int[3];
        var[3] = new int[4];
        var[4] = new int[5];

        for (int[] myLineArray : var) {
            for (int lineElement : myLineArray) {
                System.out.print(lineElement + " ");
            }
            System.out.println();
        }

    }

    private static void intro2() {
        int[][][] arr = new int[5][10][1000];
        int[] myLovelyArray = {1, 2, 3, 4, 5};
        byte[][][] byteArray = {
                {
                        {0, 1, 2},//до 127 идут байты
                        {0, 1, 2},//до 127 идут байты
                        {3, 4, 5},//до 127 идут байты
                },
                {
                        {0, 1, 2},
                        {0, 1, 2},
                        {3, 4, 5},
                },
        };
    }

    private static void intro() {
        String[][] myArray = new String[5][3];

        myArray[0][0] = "1";
        myArray[0][1] = "Матвеев";
        myArray[0][2] = "№09398434783";

        myArray[1][0] = "2";
        myArray[1][1] = "Сидоров";
        myArray[1][2] = "№09398034783";

        myArray[2][0] = "3";
        myArray[2][1] = "Петечкин";
        myArray[2][2] = "№6798434783";

        myArray[3][0] = "4";
        myArray[3][1] = "Васечкин";
        myArray[3][2] = "№093334783";

        myArray[4][0] = "5";
        myArray[4][1] = "Иванов";
        myArray[4][2] = "№0933334783";
        printTwoDStringArray(myArray);

    }

    private static void printTwoDStringArray(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "  \t");
            }
            System.out.println();
        }
    }
}

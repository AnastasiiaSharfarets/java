package lesson25;

public class MyLovelyFebruary {
    public static void main(String[] args) {
        int a = 5;
        int[] arr = new int[10];
        int[][] monthCalendar = new int[4][7];//двумерный массив 4 -строки и 7 столбцов

        for (int outer = 0; outer < monthCalendar.length; outer++) {
            for (int inner = 0; inner < monthCalendar[outer].length; inner++) {
                monthCalendar[outer][inner] = outer * 7 + inner + 1;
                // порядковый номер строчки* на кол-во дней недели+
                // порядковый номер столбика и наша любимая единичка
                System.out.print(monthCalendar[outer][inner] + " ");//обращаемся к элементу
            }
            System.out.println();
        }
        System.out.println("Pls computer give me element 2,5: " + monthCalendar[2][5]);
        System.out.println("Pls computer give me element 4,6: " + monthCalendar[3][6]);
    }
}

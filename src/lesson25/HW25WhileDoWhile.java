package lesson25;

public class HW25WhileDoWhile {
    public static void main(String[] args) {
        //Решите не используя цикл for
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        printBAtimes(12, 5);
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        System.out.println();
        printFromAtoB(5, 17);
    }

    private static void printFromAtoB(int a, int b) {
        int i = a + 1;
        while (i < b) {
            System.out.print(i + ", ");
            i++;
        }
    }

    private static void printBAtimes(int a, int b) {
        int i = 0;
        if (a > 0 && b > 0) {
            do {
                System.out.print(a + ", ");
                i++;
            } while (i < b);
        }
    }
}

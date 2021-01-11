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
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }
        /*do {
            System.out.print(a + " ");
            ;
            a++;
        } while (a < b);*/
        /*int i = a + 1;
        while (i < b) {
            System.out.print(i + ", ");
            i++;
        }*/
    }

    private static void printBAtimes(int a, int b) {
        do {
            System.out.print(a + " ");
            b--;
        } while (b > 0);

        /*int i = 0;
        if (a > 0 && b > 0) {
            do {
                System.out.print(a + " ");//сделает одну строчку все -равно даже если в==100
                i++;
            } while (i < b);
        }*/
        /*int i = 0;
        while (i < b) {
            System.out.print(a + " , и на шаге - " + i);
            i = i + 1;
            //i++;
            System.out.println();
        }*/
    }
}

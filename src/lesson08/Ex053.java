package lesson08;

import org.w3c.dom.ls.LSOutput;

public class Ex053 {
    //myLine(100) -> 7 14 21 28 35 42 49 56 63 70 77 84 91 98
    //mySecondLine(1000) -> 1 2 4 8 16 32 64 128 256 512
    public static void main(String[] args) {
        mySecondLine(1000);
        split();
        myLine(100);
    }

    private static void mySecondLine(int number) {
//        int n1 = 1;
//        int n2 = 2;
//        System.out.print(n1 + " " + n2 + "");
        for (int i = 1; i < number; i = i * 2) {
            /*int nNext = n2 * 2;
            System.out.print(" " + nNext + " ");
            n1 = n2;
            n2 = nNext;
            if (nNext < 1000) {
                System.out.println(" " + nNext + " ");
           }else System.out.println("");

             */
            System.out.print(i + " ");
        }
    }

    public static void split() {
        System.out.println();
        System.out.println("_____________");
    }

    public static void myLine(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}




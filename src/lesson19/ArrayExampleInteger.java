package lesson19;

public class ArrayExampleInteger {
    public static void main(String[] args) {
        myPrintArray1();
        System.out.println(0);
        myPrintArray2();

    }

    private static void myPrintArray2() {
        int[] myLovelyArray2 = new int[10];
        for (int i = 0; i < myLovelyArray2.length; i++) {
            System.out.print(myLovelyArray2[i] + ", ");
        }
    }

    private static void myPrintArray1() {
        int[] myLovelyArray = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        for (int i = 0; i < myLovelyArray.length; i++) {
            System.out.print(myLovelyArray[i] + " ");
        }
    }
}
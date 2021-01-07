package lesson24;

public class MaxEndTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        maxEnd3Test();//→ [3, 3, 3]
        maxEnd3Test();//→ [11, 11, 11]
        maxEnd3Test();//→ [3, 3, 3]
    }

    private static void maxEnd3Test() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        int[] testArr1 = new int[]{3, 3, 3};
        int[] testArr2 = new int[]{11, 11, 11};
        int[] testArr3 = new int[]{3, 3, 3};

        if (testArr1[0])==Hw.maxEnd3(arr1)[0] &&
                testArr1[1])==Hw.maxEnd3(arr1)[1] &&
                testArr1[2])==Hw.maxEnd3(arr1)[2] {
            System.out.println("Тест прошел успешно");
        } else{
            System.out.println("Тест провален");
        }
    }
}




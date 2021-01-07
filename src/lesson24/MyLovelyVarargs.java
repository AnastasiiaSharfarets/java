package lesson24;

public class MyLovelyVarargs {
    public static void main(String[] args) {
/*        System.out.println(addition(2, 3, 6));
        int[] arr = new int[]{2, 3, 4, 5};
        System.out.println("Сумма элементов массива " + findArraySum(arr));*/
        int[] var = new int[]{2, 3, 4, 5};
        sum();
        sum(2, 3);
        sum(2, 3, 4, 5);
        sum(var);
        отправляемРакетуВКосмос(4, 5);
        magicVarargs("Андрей", "Сергей", 3094504, 97350943, 92509, 98324509);
    }

    private static void magicVarargs(String str1, String str2, long... varargs) {
        // наш код
    }

    private static void отправляемРакетуВКосмос(int... varArgs) {
        //здесь наш гениальный код
    }

    private static int sum(int... allDigits) {
        int mySum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            mySum = mySum + allDigits[i];
        }
        return mySum;
    }

    private static int findArraySum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    private static int addition(int x, int y, int z) {
        return x + y + z;
    }
}

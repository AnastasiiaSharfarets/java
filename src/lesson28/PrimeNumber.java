package lesson28;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber(1, 11);
        primeNumber(5, 45);
    }

    private static void primeNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            if (numberPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static boolean numberPrime(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        int count = 0;//вариант 1
        boolean flag = false;//вариант 2
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                //flag = true;
            }
        }
        if (count > 0) {
            return false;
        }
        // if (flag) {
        //  return false;
        // }
        return true;
    }
}

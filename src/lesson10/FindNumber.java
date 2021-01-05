package lesson10;

public class FindNumber {
    //Дано число меньше 3000.
    // При делении числа на 32 получается остаток 30,
    // при делении на 58 - остаток 44. Найдите число или числа.
    public static void main(String[] args) {
        findNumber();
        findMagicNumbers();
        split();
    }

    public static void split(){
        System.out.println("_______________");

    }
    private static void findNumber() {
        for (int i = 1; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }

    public static void findMagicNumbers() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }

        }
    }
}

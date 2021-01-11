package lesson26;

public class ThreeUnknowing {
    public static void main(String[] args) {
        magicVariable();
    }

    private static void magicVariable() {
        //нужно написать алгоритм вывода на экран
        // всех возможных комбинаций 3-х натуральных чисел до 36
        // с определенными условиями:
        //1. необходимо использовать вложенные циклы
        //2. x <= y <= z
        //3. xyz = 36
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(" Мы победили, при этом ");
                        System.out.print("x = " + x);
                        System.out.print(", y = " + y);
                        System.out.print(", z = " + z);
                        System.out.println();
                    }
                }
            }
        }
    }
}

package lesson17;

public class Converter {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(78));//1001110
        System.out.println(convertDecimalToBinaryWhile(100));//1100100
    }

    private static String convertDecimalToBinary(int decimal) {
        String output = "";
        for (int i = decimal; i > 0; i = i / 2) {
            int remainder = i % 2;//находим цифру из двоичного числа в результате
            output = remainder + output;//записываем цифру в наш результат
        }
        return output;
    }

    public static String convertDecimalToBinaryWhile(int decimal) {
        String output = "";
        while (decimal > 0) {
            int remainder = decimal % 2;  // находим циферьку из двоичного числа в результате
            output = remainder + output;   // записываем циферьку в наш результат
            decimal = decimal / 2;   // делим ИНПУТ на два и переиспульзуем его.
        }
        return output;
    }
}

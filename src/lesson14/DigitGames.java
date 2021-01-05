package lesson14;

public class DigitGames {
    public static void main(String[] args) {
        //456 посчитать разряды 4+5+6=15;
        //364--13
        //через строку
        System.out.println(myMagicSum(2121000  ));
        System.out.println(myMagicSumOne(456));

    }

    private static int myMagicSum(int number) {
        String input = String.valueOf(number);
        int size = input.length();//длина стринге, длина числа в строке
        int sum = 0;//первоначальное значение, к которому прибавляем
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(input.substring(0, 1));//берет первый символ из текста и записывает его в int
            sum = sum + temp;
            input = input.substring(1);//отрезать первый символ который уже посчитали
        }
        return sum;
    }

    private static int myMagicSumOne(int number) {
        return 0;
    }

}

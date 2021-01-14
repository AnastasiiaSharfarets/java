package lesson29;

public class Reverse {
    public static void main(String[] args) {
        // дано число, проверить его 546-> 645;
        System.out.println(simpleNumberReverse(546));//645
        System.out.println(simpleNumberReverse(5798));//8975
        System.out.println(simpleNumberReverse(123));//321
        System.out.println(reverse("А роза упала на лапу Азора"));//
    }

    private static int simpleNumberReverse(int number) {
        //1. перевести в стирнг
        //2. просто записать наоборот, используя отдельный метод
        //3. перевести в инт и отдать
        String temp = String.valueOf(number);//"546"
        String tempReverse = reverse(temp);//"645"
        int result = Integer.parseInt(tempReverse);// 645
        return result;
    }

    private static String reverse(String input) {
        //1.стринг Аутпут
        //2.поменять буквы местами, вернуть
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            // последняя буква инпута в первую аутпута
            output = output + input.charAt(i);
        }
        return output;
    }
}

package lesson29;

public class Palindrome {
    public static void main(String[] args) {
        //перевести в один регистр toLowerCAse
        //убрать пробелы, отдельный метод
        //перевернуть слово или фразу стринг
        //сравнить инпут с аутпутом equals
        //вернуть сравнение

        //Написать свой метод проверки строки на палиндром.
        //Учесть, что палиндром может быть предложением с пробелами.
        //При решении задачи используйте цикл.
        //Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.

        System.out.println(checkPalindrome("А роза упала на лапу Азора"));// ->true
        System.out.println(checkPalindrome("пoп"));// ->true
        System.out.println(checkPalindrome("школа"));// ->false
        System.out.println(checkPalindrome("Аргентина манит негра"));// ->true
    }

    private static boolean checkPalindrome(String str) {
        String result = reverse(str);
        str = noSpaceString(str);
        result = noSpaceString(result);
        //System.out.println(result);
        return result.equalsIgnoreCase(str);
    }

    private static String noSpaceString(String str) {
        String res = "";
        char space = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != space) {
                res = res + str.charAt(i);
            }
        }
        //System.out.println(res);
        return res;
    }

    private static String reverse(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }
        //System.out.println(output);
        return output;
    }

}

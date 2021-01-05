package lesson12;

public class MyLovelyString {
    public static void main(String[] args) {
        //exampleOne();
        // exampleTwo();
        exampleThree();
    }

    private static void exampleThree() {
        String hm = "Schwarzneger";
        String newHm = hm.replace('e','Я');// замена символа е на Я
        System.out.println(newHm);

    }

    static void exampleTwo() {
        String hm = "Schwarzneger";
        int index = 4;
        System.out.println(hm.codePointAt(4));// 97 номер символа 'a' в таблице  charmap, взяли 4 букву их стринга Шварцнегер
        String euroSymbol = "€";
        System.out.println(euroSymbol.codePointAt(0));//8364
        char euroSym = 8364;//=(char) magicDigits
        System.out.println(euroSym);
        System.out.println(hm.codePointBefore(4));// символ w

    }


    protected static void exampleOne() {
        //charAt
        String hm = "Schwarzneger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length() - 3));//третья с конца буква
        char firstLetter = hm.charAt(0);
        char lastLetter = hm.charAt(hm.length() - 1);
        System.out.println("" + firstLetter + lastLetter);// номера символов сложит без кавычек
        int magicInt = firstLetter + lastLetter;

        String magicString = "" + firstLetter + lastLetter;
        String magicString2 = String.valueOf(firstLetter + lastLetter);//wrap
        String magicString3 = "";
        magicString3 += firstLetter + lastLetter;
        String magicString4 = "";
        magicString4 += firstLetter;

        int test = 5 + 4 * 7 / 10;
        System.out.println(magicString);
        System.out.println(magicString2);
        System.out.println(magicString3);
    }
}

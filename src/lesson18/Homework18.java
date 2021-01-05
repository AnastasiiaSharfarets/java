package lesson18;

public class Homework18 {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("", "Hello"));// → ""
        System.out.println(minCat("java", "Hello"));// → "javaello"
        System.out.println();
        System.out.println(deFront("Hello"));// → "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront(""));// → ""
        System.out.println(deFront("away"));// → "aay"
        System.out.println(deFront("ebay"));// → "bay"
        System.out.println(deFront("uuuuuu"));// → "uuuu"
        System.out.println();
        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));// → "Hi"
        System.out.println(withoutX2("xxi"));// → "i"
        System.out.println(withoutX2("opa"));// → "opa"
    }

    private static String withoutX2(String str) {
        if (str.charAt(0) == 'x' && str.charAt(0) != 'x') {
            return str.substring(1);
        } else if (str.charAt(1) == 'x' && str.charAt(0) != 'x') {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else {
            return str;
        }
    }

    private static String deFront(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) == 'a') {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return str.charAt(1) + str.substring(2);
        } else {
            return str.substring(2);
        }
    }

    private static String minCat(String str1, String str2) {
        int a = str1.length() - str2.length();
        int b = str2.length() - str1.length();
        if (a == 0) {
            return str1 + str2;
        } else if (a > 0) {
            return str1.substring(a) + str2;
        } else {
            return str1 + str2.substring(b);
        }
    }
}

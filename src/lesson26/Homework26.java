package lesson26;

public class Homework26 {
    public static void main(String[] args) {
        // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
        // any letter for the 'd', so "cope" and "cooe" count.
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// →2
        System.out.println(countCode("cozexxcope"));// →2
        System.out.println();
        //Return true if the given string contains a "bob" string,
        // but where the middle 'o' char can be any char.
        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b"));// →true
        System.out.println(bobThere("bac"));// →false
        System.out.println(bobThere("lkflskgslbab"));// →true
    }

    private static boolean bobThere(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'b' && str1.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return str1.contains("bob");
    }

    private static int countCode(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 3) == 'e')) {
                result++;
            }
        }
        return result;
    }
}


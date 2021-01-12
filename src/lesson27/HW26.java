package lesson27;

public class HW26 {
    public static void main(String[] args) {
        // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
        // any letter for the 'd', so "cope" and "cooe" count.
        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// →2
        System.out.println(countCode("cozexxcope"));// →2
        System.out.println(countCode("cozexxcopac"));// →1
        System.out.println(countCode("cozexxcopacо"));// →1
        System.out.println(countCode("cоjj"));// →0
        System.out.println();
        //Return true if the given string contains a "bob" string,
        // but where the middle 'o' char can be any char.
        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b"));// →true
        System.out.println(bobThere("bac"));// →false
        System.out.println(bobThere("hjjgubab"));// →true
    }

    private static boolean bobThere(String str) {
        //return str.contains("bob") || str.charAt(0) == 'b' && str.charAt(2) == 'b';
        int count = 0;
        boolean contain = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if ('b' == str.charAt(i) && 'b' == str.charAt(i + 2)) {
                count++;
                contain = true;
            }
        }
        return contain;//count > 0;
    }

    private static int countCode(String word) {
        int count = 0;
        String pattern = "code";
        for (int i = 0; i < word.length() - 3; i++) {//не нужно проверять наличие с от индекса word.length-3
            if ('c' == word.charAt(i) && 'o' == word.charAt(i + 1)
                    && 'e' == word.charAt(i + 3)) {
                count++;
            }
        }
        return count;
    }
}

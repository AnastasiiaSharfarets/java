package lesson18;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));//→"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));//→"HHH"
        System.out.println();
        //Given a string and a second "word" string, we'll say that the word matches the string
        // if it appears at the front of the string, except its first char does not need to match exactly.
        // On a match, return the front of the string, or otherwise return the empty string.
        // So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        System.out.println(startWord("hippo", "hi"));//→"hi"
        System.out.println(startWord("hippo", "xip"));//→"hip"
        System.out.println(startWord("hippo", "hip"));// →"hip"
        System.out.println(startWord("hippo", "i"));// →"h"
        System.out.println(startWord("hippo", "o"));// →"h"
    }

    private static String startWord(String str, String word) {
        String temp1 = str.substring(1);
        String temp2 = word.substring(1);
        if (str.startsWith(word)) {
            return str.substring(0, word.length());
        } else if (temp1.startsWith(temp2)) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    private static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0, 2) + word.substring(0, 2) + word.substring(0, 2);
        } else if (word.length() == 1) {
            return word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1);
        } else {
            return "";
        }
    }
}

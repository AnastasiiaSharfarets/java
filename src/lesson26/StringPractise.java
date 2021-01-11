package lesson26;

public class StringPractise {
    public static void main(String[] args) {
        //Given a string, return a string where for
        // every char in the original, there are two chars.
        //System.out.println(doubleChar("The"));//→"TThhee"
        //System.out.println(doubleChar("AAbb"));// →"AAAAbbbb"
        //System.out.println(doubleChar("Hi-There"));// →"HHii--TThheerree"
        myLovelyHM();
    }

    private static void myLovelyHM() {
        String hm = "Arnold";
        String result = "" + hm.charAt(4) + hm.charAt(4)+hm.substring(4,5);
        System.out.println(result);
    }

    private static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.substring(i, i + 1);//str.charAt(i)
        }
        return result;
    }
}

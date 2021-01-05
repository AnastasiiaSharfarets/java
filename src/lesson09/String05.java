package lesson09;

public class String05 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true)); //→ "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
    }

    private static String theEnd(String word, boolean b) {
        //если б = тру, то верни первую букву
        String output = "";
        if (b) {//b==true
            //return word.substring(0, 1);
            output = word.substring(0, 1);
        } else {
            //return word.substring(word.length() - 1);
            output = word.substring(word.length() - 1);
        }
        return output;
    }

}

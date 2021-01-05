package lesson05;

public class HomeWork {
    public static void main(String[] args) {
        /*System.out.println(bigBadaBoom(true, true));// -> true
        System.out.println(bigBadaBoom(false, false));//-> false
        System.out.println(bigBadaBoom(true, false));// -> false
        boolean capPermission = true;
        boolean jeanLucPicardPermission = true;
         */
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


    public static boolean bigBadaBoom(boolean capPermission, boolean jeanLucPicardpermission) {
        return capPermission && jeanLucPicardpermission;
    }
}

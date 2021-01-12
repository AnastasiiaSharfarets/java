package lesson27;

public class Ex14String {//

    public static void main(String[] args) {
        System.out.println("EX 4");
        //EX 4. Given a string and an int n, return a string made of n repetitions
        // of the last n characters of the string.
        // You may assume that n is between 0 and the length of the string, inclusive.
        System.out.println(repeatEnd("Hello", 3));// →"llollollo"
        System.out.println(repeatEnd("Hello", 2));// →"lolo"
        System.out.println(repeatEnd("Hello", 1));// →"o"
        System.out.println("EX 5");
        //EX 5. Given a string, consider the prefix string made of
        // the first N chars of the string.
        // Does that prefix string appear somewhere else in the string?
        // Assume that the string is not empty and that N is in the range 1..str.length().
        System.out.println(prefixAgain("abXYabc", 1));// →true
        System.out.println(prefixAgain("abXYabc", 2));// →true
        System.out.println(prefixAgain("abXYabc", 3));// →false
        System.out.println("EX 6");
        //EX 6.Returns true if for every '*' (star) in the string,
        // if there are chars both immediately before and after the star, they are the same.
        System.out.println(sameStarChar("xy*yzz"));// →true
        System.out.println(sameStarChar("xy*zzz"));// →false
        System.out.println(sameStarChar("*xa*az"));// →true
    }

    private static boolean sameStarChar(String str) {
        char star = '*';//литералы записываются  в переменные, иначе это magicNumber
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == star && str.charAt(i - 1) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.substring(n).contains(prefix);
        //return str.indexOf(prefix, n) != -1;//-1 - ничего не найдено
        //indexOf(String str, int fromIndex)
        //Returns the index within this string of the first occurrence
        // of the specified substring, starting at the specified index.
        //return str.substring(n).contains(prefix);
        //Возвращает индекс в этой строке первого вхождения
        //указанной подстроки, начиная с указанного индекса.
       /* for (int i = n; i < str.length() - n; i++) {
            if (str.substring(0, n).equals(str.substring(i, i + n))) {
                return true;
            }
        }
        return false;*/
    }

    private static String repeatEnd(String word, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += word.substring(word.length() - n);
        }
        return newWord;
       /* for (int i = word.length() - 1; i > word.length() - n; i--) {
        newWord+=word.substring()
        }*/
    }
}

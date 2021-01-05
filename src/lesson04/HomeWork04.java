package lesson04;

public class HomeWork04 {
    public static void main(String[] args) {
        String a = "<<>>";
        String text = "word";
        makeOutWord(a, text);
        makeOutWord("jjjj", "WooHoo");
    }

    public static void makeOutWord(String a, String text) {
        String makeOutWord = a.substring(0, 2) + text + a.substring(2, 4);
        System.out.println(makeOutWord);
    }
}

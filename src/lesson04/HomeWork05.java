package lesson04;

public class HomeWork05 {

    public static void main(String[] args) {
        String a = "\"";
        String text = "WooHoo";
        firstHalf("abcdef");

    }

    public static void firstHalf(String text) {
        int x = text.length();
        String a = "\"";
        String firstHalf = a + text.substring(0, x / 2) + a;
        System.out.println(firstHalf);
    }

}

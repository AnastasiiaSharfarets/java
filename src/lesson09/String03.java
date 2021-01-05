package lesson09;

public class String03 {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    public static String firstHalf(String text) {
        int half = text.length() / 2;
        String firstHalf = text.substring(0, half);
        return firstHalf;

    }


}

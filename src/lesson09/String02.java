package lesson09;

public class String02 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));


    }
    public static String makeOutWord(String out,String word){
        return out.substring(0,2) + word +out.substring(2);
    }
}

package lesson27;

public class IndexOf {
    public static void main(String[] args) {
        String hm = "Василий";
        int magicNumber = hm.indexOf("с",4);//ищет 'с' с 4 индекса=-1
        System.out.println(magicNumber);
        String prefix = "abc";
        String word = "abcljgjrgabc";
        System.out.println(word.indexOf(prefix));
        System.out.println(word.indexOf(prefix,1));
    }
}

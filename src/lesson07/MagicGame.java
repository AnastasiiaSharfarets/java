package lesson07;

public class MagicGame {
    public static void main(String[] args) {
        variant1();
        variant2();
        variant3();
    }

    public static void variant3() {
        int a = 5;
        int b = 8;
        a = a + b - (b = a);// 13-5=8; b=5;
        System.out.println(a);
        System.out.println(b);

    }

    public static void variant2() {
        int a = 5;
        int b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }

    public static void variant1() {
        int a = 5;
        int b = 8;
        //код
        //swap;
        //b=5, a = 8;
        int temp = a;
        a = b;
        b = temp;

    }
}

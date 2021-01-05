package lesson08;

public class ForExample {
    public static void main(String[] args) {
        example01();
        example02();
    }

    private static void example02() {
    }

    public static void example01() {
        int a = 3;
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println("Что происходит?");
        }
        System.out.println(a);
    }

}

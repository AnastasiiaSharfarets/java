package lesson02;

public class HelloInteger {

    public static void main(String[] args) {
        HelloInt();
        HelloLong();
    }

    public static void HelloLong() {
        System.out.println("А здесь мы рассмотрим  - long");
        long al = 23543245;
        int test = 23543245;
        long bl = 2_389_473_205L;
        long cl = 43_298_472_034L;
        long sum = al + bl;
        System.out.println(sum);
    }

    public static void HelloInt() {
        int a = 5;
        int b = 3;
        //int leftButtonUserLogin;
        int c = a + b;
        //definition
        //!!!declaration!!!
        //initialization

        int x;
        x = 7;
        int d, f, g, h, j, k, l;
        d = x;
        l = 5;
        System.out.println("Это мое а " + a);
        System.out.println("Это мое с " + c);
    }
}
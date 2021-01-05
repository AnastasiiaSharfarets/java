package lesson08;

public class Arithmetic {
    public static void main(String[] args) {
        myDecrementation();
        myMagicJava();
        split();
        // синтаксический сахар
        int a = 5;
        a = a + 10;//15
        System.out.println(a);
        a++;//a=a+1=26
        System.out.println(a);
        a += 10;//25
        System.out.println(a);
        a += 2;
        System.out.println(a);
    }
    private static void split() {
        System.out.println("________________");
    }

    public static void myDecrementation() {
        int a = 10;
        a = a - 1;
        a -= 1;
        System.out.println(a);
    }

    public static void myMagicJava() {
        int a = 10;
        a = a * 2;
        a *= 2;
        System.out.println(a);
    }
}

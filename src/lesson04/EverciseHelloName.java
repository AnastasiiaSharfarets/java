package lesson04;

public class EverciseHelloName {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); //"Hello Bob!"
        System.out.println(helloName("Alice")); // "Hello Alice!"
        System.out.println(helloName("X"));// "Hello X!"
        System.out.println(helloName("Василий"));
        System.out.println(helloNameTwo("Anton"));
        System.out.println(f(565));


    }

    public static String helloName(String name) {
        String result = "";
        String hello = "Hello";
        String lastSymbol = "!";
        char myLastSymbol = '!';
        result = hello + " " + name + lastSymbol;
        return result;
    }

    public static String helloNameTwo(String name) {
        return "Hello " + name + "!";

    }

    public static int f(int x) {
        return x * x;

    }
}

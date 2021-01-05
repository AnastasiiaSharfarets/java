package lesson09;

//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"
public class String01 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Tel Ran"));
    }

    private static String helloName(String name) {
        String result = "Hello " + name + '!';
        return result;

    }

}

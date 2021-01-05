package lesson10;

public class FizzBuzz {
    public static void main(String[] args) {

        //Given a string str, if the string starts with "f" return "Fizz".
        // If the string ends with "b" return "Buzz". If both the "f" and "b"
        //conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
        System.out.println(fizzString("jhgjkfhgjfh"));//""
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));//"Buzz"
        System.out.println(fizzString("fib"));//"FizzBuzz
    }

    private static String fizzString(String str) {
        char start = str.charAt(0);
        char end = str.charAt(str.length() - 1);
        if ((start == 'f') && (end == 'b')) {
            return "FizzBuzz";
        }
        if (start == 'f') {
            return "Fizz";
        }
        if (end == 'b') {
            return "Buzz";
        }
        return str;

    }
}

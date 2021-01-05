package lesson12;

public class HomeworkFizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));//"Buzz"
        System.out.println(fizzString("fib"));//"FizzBuzz
        System.out.println(MyColor.ANSI_RED +fizzString("jhgjkfhgjfh")+ MyColor.ANSI_RESET);// str

    }

    private static String fizzString(String str) {
        boolean magicString3 = str.startsWith("f") && str.endsWith("b");
        if (magicString3) {
            // (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }


    private static String fizzStringOne(String str) {
        // 1.Отсеять тех, кто начинается  с f и заканчивается на b
        //2. Отсеять теч, кто начинается c f.
        //3.Отсеять теч, кто начинается c b.
        //4. Все остальное.
        int lastLetter = str.length() - 1;
        if (str.substring(0, 1).equals("f")
                && str.substring(lastLetter).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(lastLetter).equals("b")) {
            return "Buzz";
        }
        return str;

    }
}
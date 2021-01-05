package lesson04;

public class HelloString {
    public static void main(String[] args) {
        //magicString();
        london();
        intToString();
        jamesBond();

    }

    public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
        System.out.println(text);
        int tryAndCry = Integer.parseInt(text);
        System.out.println(tryAndCry);

        String анатебе= "10";
        int myTry = Integer.parseInt(анатебе);
        System.out.println(myTry);


    }

    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0, 1).toUpperCase() +
                myLife.substring(1).toLowerCase());
        String game = myLife.substring(0, 1).toUpperCase() +
                myLife.substring(1, 2).toLowerCase() +
                myLife.substring(2, 3).toUpperCase() +
                myLife.substring(3, 4).toLowerCase() +
                myLife.substring(4, 5).toUpperCase() +
                myLife.substring(5, 6).toLowerCase();
        System.out.println(game);

    }

    public static void magicString() {
        String firstName = "Andrew";
        String secondName = "Podlubny";
        String user = firstName + secondName;
        int dlina = user.length();
        System.out.println(dlina);
        String first10Chars = user.substring(0, 10);
        System.out.println(first10Chars);
        System.out.println(first10Chars.toUpperCase());
    }

    public static void jamesBond() {
        String userFirstName = "James";
        String copyright = "©";
        char copyright2 = '©';
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userFirstName + " " + userSecondName + " " + age);
        String student = userFirstName + " " + userSecondName + " " + age;
        System.out.println(student);
    }
}

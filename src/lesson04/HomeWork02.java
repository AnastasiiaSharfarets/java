package lesson04;

public class HomeWork02 {
    public static void main(String[] args) {

        user();
    }

    public static void user() {
        String userFirstName = ("Анастасия");
        String userSecondName = ("Шарфарец");
        String userProfession = ("тестировщик");
        char quotes = '"';
        System.out.print(quotes);
        String user = userFirstName + " " + userSecondName + " " + userProfession;
        System.out.print(user);
        System.out.print(quotes);
    }
}

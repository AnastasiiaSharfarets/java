package lesson07;

public class Zina {

    public static void main(String[] args) {
        System.out.println(salesPermission(20000));
    }

    public static void salesPermissionThree(int age) {
        String result = "";
        if (age < 16) {
            result = "Мал еще!";
        } else if (age >= 16 && age < 18) {
            result = "Пиво продавть можно";
        } else if (age < 21) {
            result = "Кроме  водки";
        } else {
            result = "Продавать можно все";
        }

    }

    public static void salesPermissionTwo(int age) {
        if (age < 16) {
            System.out.println("Мал еще!");
        } else if (age >= 16 && age < 18) {
            System.out.println("Пиво продавть можно");
        } else if (age < 21) {
            System.out.println("Кроме  водки");
        } else {
            System.out.println("Продавать можно все");
        }
    }

    public static String salesPermission(int age) {
        String result = "";
        if (age > 18) {
            result = "Продавать можно";
        } else {
            result = "Не продавать";
        }
        return result;
    }
}
package lesson17;

import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {
        introduceYourself();
        System.out.println();
        introduceYourself2();
        System.out.println();
        ageInt();
    }

    private static void ageInt() {
        //Напишите программу, которая принимает из "сканера" возраст человека в строке
        // и отдаёт его в вашу переменную int.
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        String userAge;
        userAge = input.next();
        int age = Integer.parseInt(userAge);
        System.out.println(age);

    }

    private static void introduceYourself() {
        //Напишите программу, которой надо представиться.
        // Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
        // Для считывания данных типа String используйте метод next(): input.next()
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName;
        userName = input.next();
        System.out.println("What is your surname?");
        String userSurname;
        userSurname = input.next();
        System.out.println("What is your gender?");
        String userGender;
        userGender = input.next();
        System.out.println("How old are you?");
        String userAge;
        userAge = input.next();
        System.out.println("Your e-mail");
        String userEmail;
        userEmail = input.next();
    }
    private static void introduceYourself2() {
        String firstName, secondName, gender, email;
        int age;
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Your age plz!");
        age = inputTemp.nextInt();
        System.out.println("Your first name, plz!");
        firstName = inputTemp.next();
        System.out.println("Your second name, plz");
        secondName = inputTemp.next();
        System.out.println("Your gender");
        gender =inputTemp.next();
        System.out.println("Your e-mail");
        email= inputTemp.next();
        System.out.println("Are you "+ age+ " years old?");
    }
}

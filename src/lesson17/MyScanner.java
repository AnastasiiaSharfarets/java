package lesson17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Сколько тебе лет?");
        age = input.nextInt();
        System.out.println(age);
        System.out.println("Как тебя зовут?");
        String customerName;
        customerName = input.next();
        System.out.println("А ты уверен, " + customerName + ", что тебе " + age + " лет?");
    }
}
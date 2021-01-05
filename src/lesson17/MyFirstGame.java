package lesson17;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Print quantity of voices");
        quantity = input.nextInt();
        if (quantity > 50){
            System.out.println("Your candidate is the president! \n Congratulations!");
        }else {
            System.out.println("Your candidate is lost");
        }
    }

}


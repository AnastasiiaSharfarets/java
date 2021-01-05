package lesson07;

/*Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
при езде до 50 км/час(*включительно согласно ПДД) нарушений нет;
за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
за превышение скорости от 16 км/час — 40 евро штрафа;
за езду от 100 км/час до 130 км/час — штраф 500 евро;
и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства.
 */

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(policeAction(130));
        int speed = 140;
        speedControl(speed);
    }

    public static String policeAction(int speed) {
        String result = "";
        if (speed <= 50) {
            result = "нарушений нет";
        } else if (speed <= 65) {
            result = "устное порицание и лекция на 5 минут";
        } else if (speed <= 100) {
            result = "40 евро штраф";
        } else if (speed <= 130) {
            result = "штраф 500 евро";
        } else {
            result = "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
        return result;
    }

    public static void speedControl(int speed) {
        if (speed <= 50) {
            System.out.println("нарушений нет");
        } else if (speed <= 65) {
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (speed < 100) {
            System.out.println("40 евро штраф");
        } else if (speed < 130) {
            System.out.println("штраф 500 евро");
        } else {
            System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства");
        }

    }
}
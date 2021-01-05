package lesson13;

import static lesson13.Homework13.split;

public class CurrencyExchange {
    public static void main(String[] args) {
        //Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к
        //доллару. Естественно, “USD” возвращает 1.0 .
        //justAsk = Используя метод из предыдущего пункта написать метод,
        // который принимает пару валют (“GPB”,”EUR”) и возвращает курс обмена.
        //currencyCalculator=Используя метод из предыдущего пункта реализовать метод,
        // который получает пару валют и сумму в первой валюте,
        //возвращает сумму во второй валюте
        System.out.println(currencyConverter(1000, "EUR"));
        System.out.println(currencyConverter(700, "GPB"));
        System.out.println(currencyConverter(500, "RUB"));
        System.out.println(currencyConverter(100, "USD"));
        split();
        System.out.println(justAsk("GPB", "EUR"));
        System.out.println(justAsk("RUB", "EUR"));
        System.out.println(justAsk("RUB", "USD"));
        System.out.println(justAsk("RUB", "EUR"));
        System.out.println(justAsk("EUR", "RUB"));
        System.out.println(justAsk("EUR", "RUB"));
        System.out.println(justAsk("USD", "EUR"));
        System.out.println(justAsk("USD", "RUB"));
        split();
        System.out.println(currencyCalculator("USD", 1000, "EUR"));//
        System.out.println(currencyCalculator("EUR", 10, "USD"));
        System.out.println(currencyCalculator("RUB", 10000, "EUR"));
        System.out.println(currencyCalculator("EUR", 500, "RUB"));
        split();

    }

    public static double currencyCalculator(String input1, double money, String input2) {
        return justAsk(input1, input2) * money;

    }

    public static double justAsk(String input, String output) {
        double course = findCourse(input) / findCourse(output);
        return course;
    }

    public static double currencyConverter(double money, String currencyName) {
        return money * findCourse(currencyName);
    }

    private static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.33;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;

    }


    public static double currencyConverter1(double money, String currencyName) {
        double resultUsd = 0.0;
        double currencyCourse = 1.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.33;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return resultUsd = currencyCourse * money;

    }


}

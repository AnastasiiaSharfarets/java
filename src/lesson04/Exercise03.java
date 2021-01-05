package lesson04;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("при преданных "
                + 1000
                + " долларов клиент получит "
                + currencyConverter(1000));
    }

    public static double currencyConverter(double dollars) {
        double rate = 1.1;
        double euro = dollars / rate;
        return euro;
    }

}

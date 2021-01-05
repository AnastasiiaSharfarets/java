package lesson04;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(countMoneyBankApplication(500, 8));
    }

    public static double countMoneyBankApplication(double money, int years) {
        double interes = 3.5;
        double output;
        output = money + (money / 100) * interes * years;
        return output;

    }

}

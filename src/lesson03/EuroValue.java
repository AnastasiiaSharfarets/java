package lesson03;

public class EuroValue {
    public static void main(String[] args) {
        double euroRelation = valueRelation();
        System.out.println(euroRelation);
        System.out.println(findEuroValue(93.02154));
    }

    private static double valueRelation() {
        double a = 90.01;
        double valueRelation = a * 1.1;
        System.out.println("стоимость евро " + valueRelation);
        return valueRelation;
    }


    public static double findEuroValue(double valueDollar) {
        double valueRelation = valueDollar * 1.1;
        System.out.println("стоимость евро " + valueRelation);
        return valueRelation;
    }
}

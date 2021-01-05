package lesson03;

public class HomeWork03_6 {
    public static void main(String[] args) {
        double relation = exercise6();
        System.out.println(relation);
    }

    public static double exercise6() {
        double a = 1000;
        double relation = 7 * (1.035 * a);
        System.out.println(relation + " евро будет через 7 лет");
        return relation;
    }
}

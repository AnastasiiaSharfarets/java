package lesson03;

public class HomeWork03_5 {
    public static void main(String[] args) {
        double relation = exercise5();
        System.out.println(relation);
    }

    public static double exercise5() {
        double areaMoscow = 2511;
        double areaBerlin = 981.8;
        double relation = areaMoscow / areaBerlin;
        System.out.println("площадь Москвы больше площади Берлина в " + relation + " раз");
        return relation;
    }
}

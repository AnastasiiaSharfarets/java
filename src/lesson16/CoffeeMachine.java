package lesson16;

public class CoffeeMachine {
    public static void main(String[] args) {
        latte();
        americano();
        cappuccino();
        coffee(5);
        milk(50);
        hotWatter(100);

    }
    public static void tea(){
        hotWatter(100);
        System.out.println("Возьмите ваш пакетик чая из правого бокса");
    }
    public static void hotWatter(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void americano() {
        System.out.println("Американо готов");
        hotWatter(100);
        coffee(20);
        System.out.println("-----");
    }

    private static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);

    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);

    }
    public static void cappuccino(){
        System.out.println("Капучино готов");
        milk(30);
        hotWatter(20);
        coffee(40);
    }
    public static void latte(){
        System.out.println("Латте готов");
        milk(100);
        hotWatter(50);
        coffee(20);
    }
}

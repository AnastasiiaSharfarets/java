package lesson04;

public class Substring {
    public static void main(String[] args) {
        london();

    }
    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.substring(0, 1).toUpperCase() +
                myLife.substring(1).toLowerCase());

        String game = myLife.substring(0, 1).toUpperCase() +
                myLife.substring(1, 2).toLowerCase() +
                myLife.substring(2, 3).toUpperCase() +
                myLife.substring(3, 4).toLowerCase() +
                myLife.substring(4, 5).toUpperCase() +
                myLife.substring(5, 6).toLowerCase();
        System.out.println(game);

    }
}

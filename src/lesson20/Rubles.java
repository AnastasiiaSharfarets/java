package lesson20;

public class Rubles {
    public static void main(String[] args) {
        printSumInRub(21, 67);
        //formatRub();
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println("Всего получено " + i + " " + formatRub(i));
        }
    }

    private static String formatRub(int rub) {
        String output = "";
        int remainder10 = rub % 10;
        if (rub > 10 && rub < 15) {
            output = "рублей";
        } else if (remainder10 == 1) {
            output = "рубль";
        } else if(remainder10==2||remainder10==3||remainder10==4){
            output = "рубля";
        }
        return "";
    }
}

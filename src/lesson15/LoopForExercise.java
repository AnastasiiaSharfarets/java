package lesson15;

public class LoopForExercise {

    public static void main(String[] args) {
        System.out.println(multiply(10, 10));
        //multiply2();
        //multiply3();

    }

    public static int multiply2(int a, int b) {
        //for i------- for each потом изучим
        int result = 0;// можно вместо i сразу писать count
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }

    public static int multiply3(int a, int b) {
        //do while. Сначала делаем, потм думаем
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;
        } while (count < b);
        return result;

    }

    public static int multiply(int a, int b) {
        //while. Сначала думаем, потом делаем
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }

        return result;
    }

    public static void myInt() {
        int a = 6;
        a = a + 7;
    }

    public static void draw(int number) {
        int result = 0;


    }
}

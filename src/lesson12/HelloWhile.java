package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
        // в то время как - пока
        // while
        int a = 10;
        int b = 50;
        //evenAB(a, b);
         evenAB(7, 56);
        System.out.println();
        helloDoWhile(10,50);

    }

    private static void helloDoWhile(int x, int y) {
        do {
            System.out.print(x +" ");//выполнит все равно одно условие x=x+10=60, выведет только 60
            // Fuẞschleife -цикл ног, Kopfschleife=while
            x++;
        } while (x < y);

    }

    private static void evenAB(int a, int b) {
        while (a < b) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++; // a=a+1
        }
    }
}

package lesson15;

public class NestedLoops {
    public static void main(String[] args) {
        rectangle(5, 7);
        System.out.println();
        combinationThree();
        System.out.println();
        combinationThreeWhile();
        System.out.println();
        triangle(10);
    }

    public static void combinationThree() {
        int result = 36;
        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }

    public static void combinationThreeWhile() {
        int result = 36;
        int z = 1;
        while (z <= result) {
            int y = 1;
            while (y <= z) {
                int x = 1;
                while (x <= y) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                    x++;
                }
                y++;
            }
            z++;
        }
    }


    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

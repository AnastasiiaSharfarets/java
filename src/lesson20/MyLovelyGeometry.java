package lesson20;

public class MyLovelyGeometry {
    public static void main(String[] args) {
        //triangle(3);
        //triangleSecondVariant(10);
        //triangleTwo(5);
        //triangleThree(3);
        //triangleFour(4);
        //triangleFive(5);
        triangleSix(5);
    }

    private static void triangleSix(int height) {
        int width = 2 * height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < height - 1 - i || j > height - 1 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < i || j > width - 1 - i) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleFive(int height) {
        int width = 2 * height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < i || j > width - 1 - i) {
                    System.out.print(" ");
                } else System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void triangleFour(int height) {
        int width = 2 * height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < height - 1 - i || j > height - 1 + i) {//(height - 1) - это центр. линия треугольника,
                    // от нее влево и вправо добавляются *
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    private static void triangleThree(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 1; j <= line; j++) {
                if (j < line - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void triangleTwo(int line) {
        for (int i = line; i >= 0; i--) {
            //System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void triangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void triangleSecondVariant(int line) {
        String stroka = "";
        String star = "*";
        //stroka +=star;
        for (int i = 0; i < line; i++) {
            stroka = stroka + star;
            System.out.println(stroka);
        }
        System.out.println();
    }
}

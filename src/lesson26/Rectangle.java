package lesson26;

public class Rectangle {
    public static void main(String[] args) {
        //rectangleDraw(5,7);
        //lineDraw(15, "+");
        //lineDraw(5, "*");
        //lineDraw(5, "-");
        rectngle(5, 7, "%");
        всёСложно();
    }

    private static void всёСложно() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("*");//три строчки по 15 символов
            }
            System.out.println();
        }
    }

    private static void rectngle(int x, int y, String myLovelySymbol) {
        for (int i = 0; i < y; i++) {
          lineDraw(x, myLovelySymbol);
        }
    }

    private static void lineDraw(int x, String symbol) {
        for (int i = 0; i < x; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void rectangleDraw(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


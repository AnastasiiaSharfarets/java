package lesson15;

public class Chess {
    public static void main(String[] args) {
        //chess(8);
        System.out.println();
        //chessWhile(8);
        multiplyTable(10);
        System.out.println();
        multiplyTableWhile(10);
        System.out.println();
        multiplyTableWhile(4);
    }

    private static void multiplyTable(int lines) {
        //1.таблица
        // 2. содержимое, произведение
        //3. отформатировать
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    private static int multiplyTableWhile(int lines) {
        int result = 0;

        int i = 1;
        while (i <= lines) {

            int j = 1;
            while (j <= lines) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();

            i++;
        }
        return result;
    }


    private static void chess(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line / 2; j++) {
                if (i % 2 == 0) {//задаем чередование клеток (строка четная = * _, нечетная = _ *)
                    System.out.print("* _ ");
                } else {
                    System.out.print("_ * ");
                }
            }
            System.out.println();
        }
    }

    private static int chessWhile(int line) {
        int result = 0;

        int i = 0;
        while (i < line) {

            int j = 0;
            while (j < line / 2) {
                System.out.print("*_");
                j++;
            }
            System.out.println();

            i++;
        }
        return result;
    }

}

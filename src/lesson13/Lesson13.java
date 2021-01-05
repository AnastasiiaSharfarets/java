package lesson13;

import lesson12.MyColor;

public class Lesson13 {
    public static void main(String[] args) {

        split();
        //На складе крупной базы летом продают очень много спортивных мячей. Разного размера. Напиши метод, который в
        //зависимости от диаметра мяча подбирает более подходящую упаковку с запасом в минимум 5% от размера мяча.
        //Напишите программу, принимающую диаметр мяча и возвращающую тип коробки. Почтовые коробки на базе бывают
        //размерами:
        //Тип А - 200x200x200 мм
        //Тип Б -150x150x150 мм
        //Тип В -250x250x250 мм
        //Тип Г -350x400x500 мм
        //Тип Д -400x400x400 мм
        double basketball=320;
        double volleyball=250;
        System.out.println(boxType(volleyball));
        System.out.println(boxType(basketball));
        System.out.println(boxType(100));
        System.out.println(boxType(200));
        System.out.println(boxType(300));
        System.out.println(boxType(330));
        System.out.println(boxType(500));
    }

    private static String boxType(double ballDiameter) {
        ballDiameter = ballDiameter * 1.05;
        if (ballDiameter <= 150) {
            return "Тип Б";
        } else if (ballDiameter <= 200) {
            return "Тип А";
        } else if (ballDiameter <= 250) {
            return "Тип В";
        } else if (ballDiameter <= 350) {
            return "Тип Г";
        } else if (ballDiameter <= 400) {
            return "Тип Д";
        } else {
            return "Unknown";
        }


    }

        public static void split () {
            System.out.println(MyColor.ANSI_CYAN + "_____________" + MyColor.ANSI_RESET);
        }
    }

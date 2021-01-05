package lesson16;

public class ReviewPrimitive {
    public static void main(String[] args) {
//        firstMethod();
//        secondMethod();
//        thirdMethod();
        //example();
        //myRandom();
        fourthMethod();

    }

    private static void fourthMethod() {
        char myLovelyChar = (char) (Math.random() * (122 - 97) + 1 + 97);//случайный символ от a до z
        System.out.println(myLovelyChar);
        int count = 0;
        while (count < 100) {
            char myLovelyCharWhile = (char) (Math.random() * (122 - 97) + 1 + 97);//случайный символ от a до z
            System.out.print(myLovelyCharWhile + " ");
            count++;
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {//15 символьный пароль
            char myLovelyCharTest = (char) (Math.random() * (122 - 97) + 1 + 97);//случайный символ от a до z
            System.out.print(myLovelyCharTest + " ");
        }
        String a = "az";
        //System.out.println(a.codePointAt(0));
        //System.out.println(a.codePointAt(1));

    }

    private static void myRandom() {
        double magic = Math.random();
        System.out.println(magic);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Math.random());
//        }
        int normalNumber = (int) (Math.random() * 100);
        System.out.println(normalNumber);


    }

    private static void example() {
        double pi = 3.14;
        int piNew = (int) pi;
        double money = 5.265878;//округлить
        money = money * 100;
        int newMoney = (int) money;
        System.out.println(newMoney);
        double result = newMoney;
        System.out.println(result);
        //result = result/100;
        result /= 100;
        System.out.println(result);
    }

    private static void thirdMethod() {
        int var1 = 54;
        double var2 = var1;
        int var3 = (int) var2;

    }

    private static void secondMethod() {
        float var1 = (float) 45.5;
        float var2 = 45.5f;
        float var3 = 45.5F;
        double var4 = var1;
        float var5 = (float) var4;

    }

    private static void firstMethod() {
        //int, long, short, byte
        //float, double
        //boolean -логические, булевы переменные
        //char, String
        byte var1 = 50;
        int var2 = var1;
        byte var3 = (byte) var2;
        long var4 = var2;
        int var5 = (int) var4;
        short varShort = var1;
        byte varByte = (byte) varShort;
    }
}

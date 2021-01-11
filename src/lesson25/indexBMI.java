package lesson25;

import
        java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        yourBodyMassIndex();
    }

    public static void yourBodyMassIndex() {
        Scanner input = new Scanner(System.in);
        String customerName;
        System.out.println("Enter your name: ");
        customerName = input.next();
        double weight;
        System.out.println("Enter your weight in kg:  ");
        weight = input.nextDouble();
        double height;
        System.out.println("Enter your height in cm: ");
        height = input.nextDouble();
        double bmiResult = weight / (height / 100.0 * height / 100.0) * 100;
        int result = (int) bmiResult;
        bmiResult = (double) result / 100;
        System.out.println(customerName + ",  your body mass index is:  " + bmiResult);

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        if (bmiResult < 16) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is severe thinness" + ANSI_RESET);
        } else if (bmiResult >= 16 && bmiResult < 18.5) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is mild thinness" + ANSI_RESET);
        } else if (bmiResult >= 18.5 && bmiResult < 25) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is normal" + ANSI_RESET);
        } else if (bmiResult >= 25 && bmiResult < 30) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is overweight" + ANSI_RESET);
        } else if (bmiResult >= 30 && bmiResult < 35) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is Obese Class I" + ANSI_RESET);
        } else if (bmiResult >= 35 && bmiResult < 40) {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is Obese Class II" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED_BACKGROUND + "Your BMI is Obese Class III" + ANSI_RESET);
        }

        System.out.println("===============================");
        String[][] bmiArray = new String[8][2];
        bmiArray[0][0] = " Category ";
        bmiArray[0][1] = " BMI range  ";

        bmiArray[1][0] = " 16 or less ";
        bmiArray[1][1] = " Severe Thinness ";

        bmiArray[2][0] = " 16 – 18,5 ";
        bmiArray[2][1] = " Mild Thinness ";

        bmiArray[3][0] = " 18,5 - 25 ";
        bmiArray[3][1] = " Normal ";

        bmiArray[4][0] = " 25 -30";
        bmiArray[4][1] = " Overweight ";

        bmiArray[5][0] = " 30 – 35";
        bmiArray[5][1] = " Obese Class I ";

        bmiArray[6][0] = " 35-40";
        bmiArray[6][1] = " Obese Class II ";

        bmiArray[7][0] = " over 40";
        bmiArray[7][1] = " Obese Class III ";

        printTwoDStringArray(bmiArray);


    }

    private static void printTwoDStringArray(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "   \t");
            }
            System.out.println();
        }
    }
}


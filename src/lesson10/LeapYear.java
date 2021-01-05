package lesson10;

public class LeapYear {
    // напишите программу, которая проверяет год на високосность. Кратный четырем и не кратный 100, либо кратный 400
    public static void main(String[] args) {
        System.out.println(leapYear(2020));//true
        System.out.println(leapYear(2021));//false
        System.out.println(leapYear(1900));//false
        System.out.println(leapYear(1800));//true
        split();

        System.out.println(leapYearOne(2000));
        split();
        System.out.println(leapYearTwo(5002));
    }

    public static boolean leapYearOne(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void split() {
        System.out.println("_______________");
    }

    private static boolean leapYear(int year) {
        return year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0;//
    }

    public static boolean leapYearTwo(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;//&& year%100!=0;
    }
}

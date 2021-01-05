package lesson06;

public class HelloSwitch {
    /*
    за пятерку по контрольной в Java  -велосипед
    за 4 - GoPro новая
    за 3 - не поругают
    за 2 - отругают
    за 1  - "лучше и не спрашивай"
     */
    public static void main(String[] args) {
        /*int оценкаВЧетверти = 1;
        int score = 3;
        myFirstSwitch(оценкаВЧетверти);
        myFirstSwitch(score);
         */
        myFirstSwitch(5);
        System.out.println(myFirstSwitch(5));
    }

    public static String myFirstSwitch(int schoolScore) {
        String prize = "";
        switch (schoolScore) {
            case 1:
                prize = "Лучше и не спрашивай";
                break;
            case 2:
                prize = "отругают";
                break;
            case 3:
                prize = "не поругают";
                break;
            case 4:
                //prize = "GoPro новая";
            case 5:
                prize = "велосипед";
                break;
            default:
                prize= "Такой оценки не существует";
                break;
        }
        System.out.println(prize);
        return prize;
    }
}

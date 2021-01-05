package lesson07;

public class HomeWorkSwitch {
    public static void main(String[] args) {
        int month = 155;
        findSeason(month);
        System.out.println(findSeason(month));
        //scope  -область видимости;

    }

    public static String findSeason(int month) {
        String season = "";
        switch (month) {

            case 11:
            case 10:
            case 9:
                season = "Осень";
                break;
            case 8:
            case 7:
            case 6:
                season = "Лето";
                break;
            case 5:
            case 4:
            case 3:
                season = "Весна";
                break;
            case 2:
            case 1:
            case 12:
                season = "Зима";
                break;
            default:
                season = month + " не существует";
                break;
        }

        return season;
    }
}

package lesson06;

public class YourSwitchCalender {
    public static void main(String[] args) {
        String month = "JANUAR";
        String month1 = "Januar";
        String month2 = "januar";
        System.out.println(stringToIntMonthNumber(month));
    }

    public static int stringToIntMonthNumber(String month) {
        month = month.toLowerCase();
        System.out.println("проверка написания инпута " + month);
        int monthNumber = 0;
        switch (month) {
            case "januar":
                monthNumber = 1;
                break;
            case "Februar":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "Juny":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;
        }

        return monthNumber;
    }
}

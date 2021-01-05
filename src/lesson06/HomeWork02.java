package lesson06;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(defineTheSeason(799));
    }

    public static String defineTheSeason(int month) {
        String seasonName = "";
        switch (month) {
            case 1:
                seasonName = "winter";
                break;
            case 2:
                seasonName = "winter";
                break;
            case 3:
                seasonName = "spring";
                break;
            case 4:
                seasonName = "spring";
                break;
            case 5:
                seasonName = "spring";
                break;
            case 6:
                seasonName = "summer";
                break;
            case 7:
                seasonName = "summer";
                break;
            case 8:
                seasonName = "summer";
                break;
            case 9:
                seasonName = "autumn";
                break;
            case 10:
                seasonName = "autumn";
                break;
            case 11:
                seasonName = "autumn";
                break;
            case 12:
                seasonName = "winter";
                break;
            default:
                seasonName = "does not exist";
                break;

        }
        return seasonName;
    }
}

package lesson06;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println(intToStringKassirAction(30));
        System.out.println(getCommandByAge(8));
        System.out.println(kassirAction1(5));

    }

    public static String intToStringKassirAction(int age) {

        String kassirAction = "";
        switch (age) {
            case 10:
            case 17:
                kassirAction = "Do not sell";
                break;
            case 18:
            case 20:
            case 30:
                kassirAction = "Sell";
                break;
            default:
                kassirAction = "Do not exist";
                break;
        }
        return kassirAction;
    }

    public static boolean kassirAction1(int age) {
        return age >= 18;

    }

    //попробовала с IF ELSE
    public static String getCommandByAge(int age) {
        String result;
        if (age >= 18) {
            result = "Sell";
        } else {
            result = "Do not sell";
        }
        return result;
    }
}

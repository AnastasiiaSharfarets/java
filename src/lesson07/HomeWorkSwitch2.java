package lesson07;

public class HomeWorkSwitch2 {
    public static void main(String[] args) {
        salesPermission(10);
        System.out.println(salesPermission(10));

    }

    private static String salesPermission(int customerAge) {
        String result = "";
        switch (customerAge) {
            case 10:
            case 17:
                result = "продажа алкоголя запрещена";
                break;

            case 18:
            case 30:
                result = "продажа алкоголя разрешена";
                break;
            default:
                result = "Zina";
                break;
        }
        return result;
    }
}

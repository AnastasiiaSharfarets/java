package lesson07;
/*      Налево пойдешь - коня потеряешь,
        Направо пойдешь - жизнь потеряешь,
        Прямо пойдешь – счастье найдешь,
        Другое - не езди никуда, достал ты уже всех.
 */

public class Vityaz {
    public static void main(String[] args) {
        System.out.println(whatHappend("направо"));
        System.out.println(whatHappendTwo("kjkjkj"));
        trueWayOne("налево");
    }

    public static String whatHappend(String destination) {
        String result = "";
        switch (destination) {
            case ("налево"):
                result = "коня потеряешь";
                break;
            case ("направо"):
                result = "жизнь потеряешь";
                break;
            case ("прямо"):
                result = "счастье найдешь";
                break;
            default:
                result = "не езди никуда, достал ты уже всех";
                break;

        }
        return result;
    }

    public static String whatHappendTwo(String destination1) {
        String result = "";
        if (destination1.equals("left")) {
            result = "коня потеряешь";
        } else if (destination1.equals("right")) {
            result = "жизнь потеряешь";
        } else if (destination1.equals("straight")) {
        } else {
            result = "не езди никуда, достал ты уже всех";
        }

        return result;
    }
    private static void trueWayOne(String way) {
        // if (way == "налево")
        if (way.equals("налево")) {
            System.out.println("Колу найдешь");
        } else if (way.equals("направо")) {
            System.out.println("Пиво найдешь");
        } else if (way.equals("прямо")) {
            System.out.println("Водку найдешь");
        } else {
            System.out.println("Работу найдешь");
        }
    }
}

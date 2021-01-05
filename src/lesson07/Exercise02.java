package lesson07;

public class Exercise02 {
    public static void main(String[] args) {
        trueWayOne("jhfhgjh");
        trueWayTwo(2);
        trueWayThree(3);

    }

    private static void trueWayThree(int way) {
        switch (way) {
            case 1:
                System.out.println(("вариант1"));
                break;
            case 2:
                System.out.println(("вариант2"));
                break;
            case 3:
                System.out.println(("вариант3"));
                break;
            default:
            System.out.println(("вариант4"));
            break;

        }
    }

    public static void trueWayTwo(int way) {
        String result = "";
        if (way == 1) {
            System.out.println("направо");
        } else if (way == 2) {
            System.out.println("налево");
        } else if (way == 3) {
            System.out.println("прямо");
        } else {
            System.out.println("куда-то");
        }
    }



    public static void trueWayOne(String way) {
        //if(way=="налево")
        if (way.equals("налево")) {
            System.out.println("Колу найдешь");
        } else if (way.equals("направо")) {
            System.out.println("Пиво найдешь");
        } else if (way.equals("прямо")) {
            System.out.println("Водку найдешь");
        } else
            System.out.println("на работу пойдешь");
    }
}

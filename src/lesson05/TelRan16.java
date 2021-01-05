package lesson05;

public class TelRan16 {
    public static void main(String[] args) {
        String student1 = "Саша";
        String student2 = "Даша";
        String student3 = "Паша";
        System.out.println(introMessage(student1));
        System.out.println(introMessage(student2));
        System.out.println(introMessage(student3));
    }

    public static String introMessage(String name) {
        String message = "Вы зачислены на базовый курс программирования";


        return "Добрый день, " + name + "!" + "\n" + message;
    }

}

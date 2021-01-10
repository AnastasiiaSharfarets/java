package lesson25;

public class Homework25 {
    public static void main(String[] args) {
        System.out.println("Задачи по теме \"Тернарный оператор\"");
        //Даны два числа, a и b. Верните большее из них.
        // Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println("Задача №1. Большее число равно: ");
        System.out.println(getMeMax(15, 5));//→ 15
        System.out.println(getMeMax(4, 16));//→ 16
        System.out.println(getMeMax(20, 100));//→ 100

        //Даны два числа, a и b. Верните меньшее из них.
        // Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println("Задача №2. Меньшее число равно: ");
        System.out.println(getMeMin(-15, 45));//→ -15
        System.out.println(getMeMin(44, 16));//→ 16
        System.out.println(getMeMin(200, 100));//→ 100

        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        System.out.println("Задача №3. Названия по алфавиту: ");
        System.out.println(myFirstCompareTo("", ""));//→ "Введите название городов"
        System.out.println(myFirstCompareTo("0", "13"));//→0, а надо "Введите название городов"
        //вопрос про ввод не букв, а цифр пользователем
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));//→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Minsk", "Minusinsk"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
    }

    private static String myFirstCompareTo(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return "Введите название городов";
        }
        int length = str1.length() > str2.length() ? str2.length() : str1.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return str1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return str2;
            }
        }
        if (str1.length() > length) {
            return str2;
        } else if (str2.length() > length) {
            return str1;
        }
        return str1;
        //return (str1.compareTo(str2) < 0 ? str1 : str2);
    }

    private static int getMeMin(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return (a > b) ? a : b;
    }
}

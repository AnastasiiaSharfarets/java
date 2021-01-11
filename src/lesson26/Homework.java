package lesson26;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Задача №3. Названия по алфавиту: ");
        //System.out.println(myFirstCompareTo("", ""));//→ "Введите название городов"
        System.out.println(myFirstCompareTo("0", "13"));//→0, а надо "Введите название городов"
        //вопрос про ввод не букв, а цифр пользователем
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));//→ "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Minsk", "Minusinsk"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
    }

    private static String myFirstCompareTo(String word1, String word2) {
        char firstLetterFirstWord = word1.charAt(0);
        char firstLetterSecondWord = word2.charAt(0);
        return (firstLetterFirstWord < firstLetterSecondWord)
                ? word1 : word2;
        //return (word1.compareToIgnoreCase(word2)<0)? word1 : word2;
    }
}

package lesson20;

public class Caesar {
    public static void main(String[] args) {
        //Разработайте шифровальную машину для нового клиента фирмы - Гая Юлия Цезаря.
        //Клиент придумал шифровальный алгоритм и хочет, что бы мы реализовали его в методе.
        //Пример выполнения метода:
        // enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.")
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
        System.out.println(enigmaCaesar("Съешь же еЩё этих мягких французских булок, да выпей чаю."));

    }

    public static String enigmaCaesar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isLowerCase(symbol)) {
                output = output + symbolCode(symbol);
            } else {
                output = output + Character.toUpperCase(symbolCode(Character.toLowerCase(symbol)));
            }
        }

        return output;
    }

    private static char symbolCode(char symbol) {
        char result = 0;
        //1.result = (char) (symbol + 3);
        //2. первый вариант + исключения через if
        //3. сделать свою таблицу инпута и аутпута через стринг или через массив символов
        //4.Switch
        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,.";
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв ,.";

        int index = input.indexOf(symbol);// индекс от буквы "в" = 2
        result = output.charAt(index);
        return result;
    }
}

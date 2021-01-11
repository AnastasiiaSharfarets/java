package lesson17;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println(StringMethods4("java"));
    }

    public static char StringMethods1(String str) {
        return str.charAt(2);
    }
    //charAt(int index) - возвращает символ строки по индексу;

    public static int StringMethods2(String str) {
        return str.codePointAt(1);
    }
    //codePointAt(int index) -принимает int в качестве параметра и
    // возвращает кодовую точку с указанным индексом.
    //Кодовая точка - это десятичное значение, которое символ задается в стандарте Unicode.

    public static int StringMethods3(String str) {
        return str.codePointBefore(1);
    }
    //codePointBefore(int index)-принимает int в качестве параметра и
    // возвращает кодовую точку с указанным индексом от предыдущего символа

    public static int StringMethods4(String str) {
        return str.codePointCount(1, 4);
    }
    //codePointCount(int beginIndex, int endIndex)-возвращает количество кодовых точек Unicode
    // в указанном текстовом диапазоне строки.
    //Диапазон текста начинается с первого индекса и заканчивается у второго индекса - 1.

    public static int StringMethods5(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }
    //compareToIgnoreCase(String str)-сравнивает лексически две строки, игнорируя регистр букв.
    //возвращает отрицательное целое число, ноль или положительное целое число, если заданная строка меньше,
    // равна или больше сравниваемой строки, игнорируя регистр.

    public static String StringMethods6(String str1, String str2) {
        return str2.concat(str1);
    }
    //concat(String str) -объединяет строки

    public static boolean StringMethods7(String str) {
        return str.contains("Jaa");
    }
    //contains(CharSequence s)-проверить, содержит ли String указанную последовательность символов.
    //Этот метод возвращает логический тип данных, который является результатом тестирования,
    // если строка содержит символы, указанные в аргументе метода в типе объекта CharSequence.
    //Метод contains() возвращает true тогда и только тогда,
    // когда эта строка содержит указанную последовательность значений char.

    public static boolean StringMethods8(String str) {
        return str.endsWith("a");
    }
    //endsWith(String suffix)-определяет, заканчивается ли строка на определенную подстроку

    public static boolean StringMethods9(String str) {
        return str.equals("java");
    }
    //equals(Object anObject)-сравнивает строки с учетом регистра

    public static boolean StringMethods10(String str) {
        return str.equalsIgnoreCase("java");
    }
    //equalsIgnoreCase(String anotherString)-сравнивает строки без учета регистра

    public static int StringMethods11(String str) {
        return str.indexOf("v");
    }
    //indexOf(int ch)- находит индекс первого вхождения подстроки в строку

    public static boolean StringMethods12(String str) {
        return str.isEmpty();
    }
    //isEmpty() - проверяет пустая сторока или нет

    public static int StringMethods13(String str) {
        return str.length();
    }
    //length()-находит длину строки

    public static String StringMethods14(String str) {
        return str.replace("va", "Ja");
    }
    //replace(char oldChar, char newChar)-заменяет в строке одну подстроку на другую

    public static boolean StringMethods15(String str) {
        return str.startsWith("ja");
    }
    //startsWith(String prefix)-определяет, начинается ли строка с подстроки

    public static char[] StringMethods16(String str) {
        char[] result = str.toCharArray();
        System.out.println("Char array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]: " + result[i]);
        }
        return result;
    }
    //toCharArray() -преобразовывает строку в массив символов

    public static String StringMethods17(String str) {
        return str.toLowerCase();
    }
    //toLowerCase() -переводит все символы строки в нижний регистр

    public static String StringMethods18(String str) {
        return str.toUpperCase();
    }
    //toUpperCase()-переводит все символы строки в верхний регистр

    public static String StringMethods19(String str) {
        return str.trim();
    }
    //trim() -удаляет начальные и конечные пробелы
}

package lesson12;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        System.out.println(inOrder(10, 1, 2, false));// → false

        split();

        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true

        split();

        System.out.println(theEnd2("Hello", true));//→ "H"
        System.out.println(theEnd2("Hello", false));// → "o"
        System.out.println(theEnd2("oh", true));// → "o"
        System.out.println(theEnd2("орлордлр", false));// → "р"

        split();

        System.out.println(endsLy2("oddly"));// → true
        System.out.println(endsLy2("y"));// → false
        System.out.println(endsLy2("oddy"));// → false

        split();

        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
        System.out.println(middleThree("so"));// → "so"
        System.out.println(middleThree("ololoo"));// → "ololoo"
    }

    private static String middleThree(String text) {
        //Дана строка нечетной длины.
        // Верните строку длиной 3 от ее середины, так что «Candy» даст «and». Для строки любой длины
        // Длина строки будет равна минимум 3.
        int a = text.length();
        if ((a >= 3) && (a % 2 == 1)) {
            return text.substring(a / 2 - 1, a / 2 + 2);
        } else return text;
    }

    private static String middleThree2(String input) {
        //строка нечетной длины и больше 3 символов
        int middle = input.length() / 2;
        String output = input.substring(middle - 1, middle + 2);
        return output;
    }

    private static boolean endsLy(String oddly) {
        //Для данной строки вернуть истину, если она заканчивается на «ly».
        if (oddly.length() < 2) {
            return false;
        }
        char lastLetter = oddly.charAt(oddly.length() - 1);
        char prelastLetter = oddly.charAt(oddly.length() - 2);
        return lastLetter == 'y' && prelastLetter == 'l';
    }

    private static boolean endsLy2(String input) {
        return input.endsWith("ly");
    }

    private static String theEnd(String str, boolean front) {
        //Для данной строки вернуть строку длиной 1 с ее начала,
        // если передняя часть не является ложной, и в этом случае вернуть строку длиной 1 с ее задней стороны.
        //Строка не будет пустой.
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        if (front) {
            return String.valueOf(firstLetter);//valueOf  возвращает стрингу значение char аргумента
        }
        return String.valueOf(lastLetter);
    }

    private static String theEnd2(String str, boolean front) {
        String result = str.substring(0, 1);
        if (!front) {
            result = str.substring(str.length() - 1);
        }
        return result;
    }

    private static boolean lessBy10(int a, int b, int c) {// Задача lovely 6
        return (a - b >= 10 || b - a >= 10 || c - b >= 10 || b - c >= 10 || a - c >= 10 || c - a >= 10);
    }

    private static boolean lessBy10Two(int a, int b, int c) {
        //retrn Math.abs(a-b) >=10 && Math.abc(b-c)>=10|| Math.abs(c-a)>=10
        if (a <= b - 10 || a <= c - 10) {
            return true;
        } else if (b <= a - 10 || b <= c - 10) {
            return true;
        } else if (c <= a - 10 || c <= b - 10) {
            return true;
        }
        return false;
    }

    private static boolean lessBy10Three(int a, int b, int c) {
        return Math.abs(a - b) >= 10 && Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10; // Math.abs - модуль
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        //Даны три числа a, b, c. Вернуть истину, если а<b и b<c. Однако, за исключением того, если "bOk"
        //правда, b не обязательно должно быть больше a. (то есть проверяем только b<c)
        if (bOk) {
            return (b < c);
        }
        return (a < b && b < c);
    }

    private static boolean inOrder2(int a, int b, int c, boolean bOk) {
        return b > a && c > b && !bOk || c > b && bOk;
    }

    private static boolean inOrder3(int a, int b, int c, boolean bOk) {
        if (bOk && c > b) {
            return true;
        } else if (b > c && c > b) {
            return true;
        }
        return false;
    }

    public static void split() {
        System.out.println(MyColor.ANSI_CYAN + "_____________" + MyColor.ANSI_RESET);

    }
}


package lesson08;

public class Alphabet {
    //Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("" + c + c + c + c);
        }
    }

}

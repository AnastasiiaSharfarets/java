package lesson19;

public class ArrayIntro {
    public static void main(String[] args) {
        //introOne();
        //introOld();
        //arrayDeclarationAndInitialization();
        //germanCitiesExample();
        anotherExample();
    }

    private static void anotherExample() {
        String hm = "Василий";
        String gubernator = "Schwartzeneger";
        String[] people = new String[]{hm, gubernator};
        System.out.println(hm.length());
        System.out.println(people[0].length());
        System.out.println(people[1].length());//длинна элемента индекса 1 массива hm
        System.out.println(people[0].length() + people[1].length());
        int result = 0;
        for (int i = 0; i < people.length; i++) {
            result = result + people[i].length();
        }
        System.out.println(result);
    }

    private static void germanCitiesExample() {
        String[] germanCities = new String[]{"Berlin", "Munchen", "Dresden"};
        int allGermanCities = germanCities.length;
        int allLetter = 0;
        for (int i = 0; i < allGermanCities - 1; i++) {
            allLetter = allLetter + germanCities[i].length();
        }
        System.out.println("allGermanCities: " + allGermanCities);
        System.out.println("allLetter: " + allLetter);
    }

    private static void arrayDeclarationAndInitialization() {
        //<<ИмяУжеОбъявленнойПеременной>> = new <<ТипЛанных>> <<Длина массива>>
        int[] justExample = new int[10];
        int[] justExampleTwo;
        justExampleTwo = new int[1001];
        int[] field = new int[]{10, 15, 3, 7, 4, 9, 8};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13};
        String theBestCityInTheWorld = "Berlin";

        String[] fourSeasons = new String[]{"Vivaldi", "Чайковский", "Hotels"};
    }

    private static void introOld() {
        int myArray[];//устаревшая запись в СС
        String user[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];
    }

    private static void introOne() {
        int[] myArray;
        String[] user;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;
    }
}

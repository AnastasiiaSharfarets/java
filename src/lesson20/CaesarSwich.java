package lesson20;

public class CaesarSwich {
    public static void main(String[] args) {
        System.out.println(enigmaCaesarReverse("Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб"));
    }

    private static String enigmaCaesarReverse(String str) {
        str = str.toLowerCase();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'а':
                    newStr += 'э';
                    break;
                case 'б':
                    newStr += 'ю';
                    break;
                case 'в':
                    newStr += 'я';
                    break;
                case 'г':
                    newStr += 'а';
                    break;
                case 'д':
                    newStr += 'б';
                    break;
                case 'е':
                    newStr += 'в';
                    break;
                case 'ё':
                    newStr += 'г';
                    break;
                case 'ж':
                    newStr += 'д';
                    break;
                case 'з':
                    newStr += 'е';
                    break;
                case 'и':
                    newStr += 'ё';
                    break;
                case 'й':
                    newStr += 'ж';
                    break;
                case 'к':
                    newStr += 'з';
                    break;
                case 'л':
                    newStr += 'и';
                    break;
                case 'м':
                    newStr += 'й';
                    break;
                case 'н':
                    newStr += 'к';
                    break;
                case 'о':
                    newStr += 'л';
                    break;
                case 'п':
                    newStr += 'м';
                    break;
                case 'р':
                    newStr += 'н';
                    break;
                case 'с':
                    newStr += 'о';
                    break;
                case 'т':
                    newStr += 'п';
                    break;
                case 'у':
                    newStr += 'р';
                    break;
                case 'ф':
                    newStr += 'с';
                    break;
                case 'х':
                    newStr += 'т';
                    break;
                case 'ц':
                    newStr += 'у';
                    break;
                case 'ч':
                    newStr += 'ф';
                    break;
                case 'ш':
                    newStr += 'х';
                    break;
                case 'щ':
                    newStr += 'ц';
                    break;
                case 'ъ':
                    newStr += 'ч';
                    break;
                case 'ы':
                    newStr += 'ш';
                    break;
                case 'ь':
                    newStr += 'щ';
                    break;
                case 'э':
                    newStr += 'ъ';
                    break;
                case 'ю':
                    newStr += 'ы';
                    break;
                case 'я':
                    newStr += 'ь';
                    break;
                case ' ':
                    newStr += ' ';
                    break;
                case ',':
                    newStr += ',';
                    break;
                case '.':
                    newStr += '.';
                    break;
            }
        }
        return newStr;
    }
}

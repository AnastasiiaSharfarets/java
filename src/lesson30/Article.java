package lesson30;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;// руки прочь

public class Article {
    int id;
    String title;
    String url;
    String date;
    String announce;
    String author;
    String articleText;
    Image img; //фото

    // раньше
    Date today;
    LocalDate day;
}

class ArticleTest {
    public static void main(String[] args) {
        Article lockDownJanuary2021 = new Article();
        lockDownJanuary2021.title = "Локдаун снимаем завтра!";
        lockDownJanuary2021.articleText = "Я памятник себе воздвиг нерукотворный,\n" +
                "К нему не зарастет народная тропа,\n" +
                "Вознесся выше он главою непокорной\n" +
                "Александрийского столпа.\n" +
                "\n" +
                "Нет, весь я не умру — душа в заветной лире\n" +
                "Мой прах переживет и тленья убежит —\n" +
                "И славен буду я, доколь в подлунном мире\n" +
                "Жив будет хоть один пиит.\n" +
                "\n" +
                "Слух обо мне пройдет по всей Руси великой,\n" +
                "И назовет меня всяк сущий в ней язык,\n" +
                "И гордый внук славян, и финн, и ныне дикой\n" +
                "Тунгус, и друг степей калмык.\n" +
                "\n" +
                "И долго буду тем любезен я народу,\n" +
                "Что чувства добрые я лирой пробуждал,\n" +
                "Что в мой жестокий век восславил я Свободу\n" +
                "И милость к падшим призывал.\n" +
                "\n" +
                "Веленью божию, о муза, будь послушна,\n" +
                "Обиды не страшась, не требуя венца,\n" +
                "Хвалу и клевету приемли равнодушно\n" +
                "И не оспоривай глупца.\n" +
                "\n";
        lockDownJanuary2021.announce = "Очень короткий анонс";
        lockDownJanuary2021.day = LocalDate.now();
        System.out.println(lockDownJanuary2021.day);
        //System.out.println(lockDownJanuary2021.articleText);
        lockDownJanuary2021.url ="https://github.com/tel-ran-de/16m-java1/issues/28";
        System.out.println(lockDownJanuary2021.url);
    }
}
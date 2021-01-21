package lesson30;

public class Duck {
    String breed; //порода утки
    int age;
    String color;
    String name;
    int rangeAge;// километраж

    @Deprecated // не используется
    void quacks() {
        System.out.println("Duck quacks // Уточка крякает");
    }

    void eats() {
        System.out.println("Duck eats // Уточка ест");
    }

    void swims(int meter) {
        System.out.println(name + " swims");
        rangeAge = rangeAge + meter;
    }

    void flies() {
        System.out.println("I BELITVE!");
        System.out.println("I CAN FLY!");
        System.out.println("I FLY!");
    }
}

class DuckTest {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.name = "Donald";
        Duck daisy = new Duck();
        Duck goofy = new Duck();
        Duck daffy = new Duck();
        daffy.name = "Daffy";
        Duck[] newDuckArray = new Duck[]{donald, daisy, goofy};
        System.out.println(newDuckArray[0].name);
        newDuckArray[0] = daffy;
        System.out.println(newDuckArray[0].name);

        // проверка километража
        goofy.name = "Goofy";
        goofy.swims(100);
        System.out.println("Состояние спидометра " + goofy.rangeAge);
    }

}
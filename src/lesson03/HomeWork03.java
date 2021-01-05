package lesson03;

public class HomeWork03 {
    public static void main(String[] args) {
        double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise04AnotherTime(3232365, 65656));

    }

    public static double exercise04AnotherTime(double firstArea, double secondArea) {
        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }

    public static double exercise04() {
        //найти соотношение площади Беларуси к Украине;
        // B площадь Белоруси 207,595 км. кв.;
        // U площадь Укпаины 603,628 км кв;
        double belarusArea = 207.595;
        double ukraineArea = 603.628;
        double relation = belarusArea / ukraineArea;
        System.out.println("соотношение площадей двух стран " + relation);
        return relation;

    }
}


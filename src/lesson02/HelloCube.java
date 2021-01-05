package lesson02;

public class HelloCube {
    public static void main(String[] args) {
        //дан куб со стороной 10;
        //найти площадь и периметр;
        //int a = 10
        findPerimetr();
        findSquare();
    }
    public static void findPerimetr(){
        int a = 10;
        int perimetr = 12 * a;
        System.out.println("периметр куба равен:" + perimetr);

    }

    public static void findSquare(){
        int a = 10;
        int quadratSquare = a * a;
        int cubeSquare = 6 * quadratSquare;
        System.out.println("площадь куба равна:" + cubeSquare);

    }
}


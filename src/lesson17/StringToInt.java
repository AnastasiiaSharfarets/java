package lesson17;

public class StringToInt {
    public static void main(String[] args) {
        String age = "18";
        int myAge = Integer.parseInt(age);
        String output = "" + myAge;
        String output1 = String.valueOf(myAge);
        System.out.println(myAge);
        System.out.println(output);
        System.out.println(output1);
        System.out.println(age);
    }
}

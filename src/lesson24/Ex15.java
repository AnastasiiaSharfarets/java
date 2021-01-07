package lesson24;

public class Ex15 {
    public static void main(String[] args) {
        /*
        Start with 2 int arrays, a and b,of any length.
         Return how many of the arrays have 1 as their first element
         */
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{7, 2, 3};
        int[] arr3 = new int[]{1, 2};
        int[] arr4 = new int[]{1, 3};
        int[] arr5 = new int[]{1};
        int[] arr6 = new int[0];
        int[] arr7 = new int[]{0, 3};
        int[] arr8 = new int[]{2, 3, 4};
        System.out.println(start1(arr1, arr4));  //→2
        System.out.println(start1(arr2, arr5)); //→1
        System.out.println(start1(arr3, arr6)); //→1
        System.out.println(start1(arr7, arr8)); //→0
    }

    private static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            //count++;
            count += 1;
        }

        if (b.length >= 1 && b[0] == 1) {
            count = count + 1;
            //++count;
        }
        return count;
    }
}

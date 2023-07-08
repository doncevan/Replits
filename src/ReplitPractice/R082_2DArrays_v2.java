package ReplitPractice;

public class R082_2DArrays_v2 {
    public static void main(String[] args) {
        // Write a program that will print the sum of all elements in 2D array.
        int[][] arrs = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        for (int[] arr : arrs) {
            for (int elem : arr) {
                sum +=elem;
            }
        }
        System.out.println(sum);
    }
}

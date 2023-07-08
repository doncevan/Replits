package ReplitPractice;

public class R083_2DArrays {
    public static void main(String[] args) {
        //Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers.
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        for (int[] ints : a) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += ints[j];
            }
            System.out.println(rowSum);
        }
    }
}

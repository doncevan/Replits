package ReplitPractice;

public class R084_2DArrays {
    public static void main(String[] args) {
        // Write a program that prints the total number of elements that are negative AND odd.
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count = 0;
        for (int[] ints : a) {
            for (int anInt : ints) {
                if (anInt % 2 == -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


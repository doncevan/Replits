package ReplitPractice;

public class R079_2DArrays {
    public static void main(String[] args) {
        // Write a program to print values from a 2D array.
        double[][] numbs = {{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}};
        for (double[] num : numbs) {
            for (int col = 0; col < num.length; col++) {
                System.out.print(num[col] + " ");
            }
            System.out.println();
        }
    }
}
package ReplitPractice;

public class R080_2DArrays {
    public static void main(String[] args) {
        //Write a program to double the values of every element in the array and print it out.
        double[][] a = {
                {1.4,2.0,3.3,2.0},
                {4,1.5,6.1,1.0},
                {1.2,3.1,4,1.6}
        };
        for (double[] num : a) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j]*2 + " ");
            }
            System.out.println();

        }
    }

}

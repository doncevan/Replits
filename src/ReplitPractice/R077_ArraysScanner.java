package ReplitPractice;

import java.util.Scanner;

public class R077_ArraysScanner {
    public static void main(String[] args) {
    /* Create an array of integers that will store 5 elements taken from a user Don't print any prompt message for the user
            Then print out all the elements you have created in the first loop in reverse order.  */
        int[] numbs = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 4; i >= 0; i--) {
            numbs[i] = scan.nextInt();
        }
        for (int num : numbs) {
            System.out.println(num);
        }
    }
}

package ReplitPractice;

import java.util.Scanner;

public class R065_ForLoopScan {
    public static void main(String[] args) {
        /* Write a for loop that will print out a series of numbers starting at one less than x and ending at 0. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}

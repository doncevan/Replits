package ReplitPractice;

import java.util.Scanner;

public class R063_ForLoopScan {
    public static void main(String[] args) {
        /* Given the following inputs:  int x;  Write a for loop that will print out a series of numbers starting
         at 0 and ending at the x(value must be taken from a user), exclusive.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }
    }
}


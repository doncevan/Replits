package ReplitPractice;

import java.util.Scanner;

public class R028_IfElseScanner {
    public static void main(String[] args) {
        /* Write a program to take values of length and width from the user.
        Based on value define whether the shape is a square or rectangle.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scan.nextInt();
        System.out.println("Please enter the width");
        int width = scan.nextInt();
        if (length != width) {
            System.out.println("The shape of your objects rectangle");
        } else {
            System.out.println("The shape of your object is square");
        }
    }
}

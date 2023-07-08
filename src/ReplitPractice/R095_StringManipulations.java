package ReplitPractice;
/*
Using Scanner class input string value.
Print out the following: "The first 3 letters of ___ is ___"
For example, if the input is "banana", your output should be: "The first 3 letters
of banana is ban".
*/

import java.util.Scanner;

public class R095_StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string value");
        String user = scan.nextLine();
        String first3letters = user.substring(0, 3);
        System.out.println("The first 3 letters of " + user + " is " + first3letters);
    }
}

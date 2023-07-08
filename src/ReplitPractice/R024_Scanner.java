package ReplitPractice;

import java.util.Scanner;

public class R024_Scanner {
    public static void main(String[] args) {
        //Write a program that takes a user's name and prints it.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name = scan.next();
        System.out.println("Your name is " + name);
    }
}

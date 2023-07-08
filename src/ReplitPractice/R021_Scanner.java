package ReplitPractice;

import java.util.Scanner;

public class R021_Scanner {
    public static void main(String[] args) {
        /* Write a program that asks the user's age: "Enter your age  "
          Then display it by adding 10 (i.e age + 10) in your final output.
                Enter your age...           Your age after 10 years is .... */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        int years = 10;
        age += 10;
        System.out.println("Your age after " + years + " years is " + age);
    }
}

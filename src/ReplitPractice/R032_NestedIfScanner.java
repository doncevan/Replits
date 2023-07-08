package ReplitPractice;

import java.util.Scanner;

public class R032_NestedIfScanner {
    public static void main(String[] args) {
        /* Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"
            You have 2 conditions:
    If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"
    If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = scan.next().charAt(0);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (gender == 'F' && age >= 25) {
            System.out.println("Woman");
        } else if (gender == 'M' && age >= 25) {
            System.out.println("Man");
        } else if (gender == 'F') {
            System.out.println("Girl");
        } else {
            System.out.println("Boy");
        }
    }
}


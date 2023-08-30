package ReplitPractice;

import java.util.Scanner;

public class R034_ScannerElseIf {
    public static void main(String[] args) {
        //Write a program to find the largest number among three distinct numbers using nested if condition
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }
    }
}


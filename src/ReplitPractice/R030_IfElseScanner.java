package ReplitPractice;

import java.util.Scanner;

public class R030_IfElseScanner {
    public static void main(String[] args) {
        /*Write a program to take the month number from a user.  Provide month name to the corresponding month number
        If a user provides any number that is out of month range, the program should display "Invalid"  */
        Scanner month = new Scanner(System.in);
        System.out.println("Please enter month number");
        int monthNumber = month.nextInt();
        String out;
        if (monthNumber == 1) {
            out = "January";
        } else if (monthNumber == 2) {
            out = "February";
        } else if (monthNumber == 3) {
            out = "March";
        } else if (monthNumber == 4) {
            out = "April";
        } else if (monthNumber == 5) {
            out = "May";
        } else if (monthNumber == 6) {
            out = "June";
        } else if (monthNumber == 7) {
            out = "July";
        } else if (monthNumber == 8) {
            out = "August";
        } else if (monthNumber == 9) {
            out = "September";
        } else if (monthNumber == 10) {
            out = "October";
        } else if (monthNumber == 11) {
            out = "November";
        } else if (monthNumber == 12) {
            out = "December";
        } else {
            out = "Invalid";
        }
        System.out.println(out);
    }
}


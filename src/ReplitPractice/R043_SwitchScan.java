package ReplitPractice;

import java.util.Scanner;

public class R043_SwitchScan {
    public static void main(String[] args) {
        /* Write a program to input number "Input a number between 1-12" and when you input a number it should display the month
        using Scanner and Switch statement.      case: 1 will display January      case: 12 will display December
                        Anything outside 12 will display "Invalid" */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1-12");
        int month = scan.nextInt();
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid");
        }
    }
}

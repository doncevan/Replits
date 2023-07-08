package ReplitPractice;

import java.util.Scanner;

public class R045_SwitchScan {
    public static void main(String[] args) {
        /* Ask the user to enter any number from 1-7.   Based on the number define the day of the week */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7.");
        int dayOfTheWeek = scan.nextInt();
        switch (dayOfTheWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid");
        }
    }
}

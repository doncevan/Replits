package ReplitPractice;

import java.util.Scanner;

public class R038_LogicalOpsElseIf {
    public static void main(String[] args) {
        /* Prompt user with a question: "Is it weekend?" If it is not a weekend --> subject="manual testing"
                            Otherwise --> subject="Java" */
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean isWeekend = scan.nextBoolean();
        if (!isWeekend) {
            System.out.println("Today you will be learning manual testing");
        } else {
            System.out.println("Today you will be learning Java");
        }
    }
}

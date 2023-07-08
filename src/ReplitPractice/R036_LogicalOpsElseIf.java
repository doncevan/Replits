package ReplitPractice;

import java.util.Scanner;

public class R036_LogicalOpsElseIf {
    public static void main(String[] args) {
        /* Prompt user to input two strings : "Please enter two strings" and two integers: "Please enter two numbers" and make the comparisons:
            - if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
            - if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
            - if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE" */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 == num2 && word1.equals(word2)) {
            System.out.println("AND");
        } else if (num1 == num2 || word1.equals(word2)) {
            System.out.println("OR");
        } else {
            System.out.println("NONE");
        }
    }
}

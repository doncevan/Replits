package ReplitPractice;

import java.util.Scanner;

public class R099_StringManipulations_IfElse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a string as an givenString to check whether it is palindrome or not");
        String str = inp.nextLine();
        str = str.replaceAll(" ", "").toLowerCase();
        String revr = new StringBuilder(str).reverse().toString();
        if (str.equals(revr)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


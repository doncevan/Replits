package ReplitPractice;
/*
Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string. */
import java.util.Scanner;

public class R100_StringManipulations_SB_ForLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);

        //---------------------------------------------------------
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
}

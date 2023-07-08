package ReplitPractice;
/*
Write code that will take in a String input and check to see if it is a palindrome
or not.
A palindrome means that the characters are the same forwards and backwards,ignoring spaces.
Examples of palindromes:
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star
Your check should be case-insensitive too. For example, "Bob" is a palindrome,
despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.
*/
import java.util.Scanner;

public class R099_StringManipulations_While {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a string as an givenString to check whether it is palindrome or not");
        String givenString = inp.nextLine();
        givenString = givenString.replaceAll(" ", "").toLowerCase();
        int left = 0, right = givenString.length() - 1;
        while (left < right) {
            if (givenString.charAt(left) != givenString.charAt(right)) {
                System.out.println(false);
                return;
            } else {
                left++;
                right--;
                continue;
            }
        }
        System.out.println(true);
    }
}

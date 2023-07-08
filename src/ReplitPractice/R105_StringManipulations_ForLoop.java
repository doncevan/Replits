package ReplitPractice;
/*
There is a code that takes input as a String.
Write a program that will print out only vowels of that string  */
import java.util.Scanner;

public class R105_StringManipulations_ForLoop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
           /*  if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'
                    || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                System.out.print(word.charAt(i)+"");
            }  */
            char a = word.charAt(i);
            if (a == 'a' || a == 'e' || a == 'o' || a == 'u' || a == 'i' || a ==
                    'A' || a == 'E' || a == 'O' || a == 'U' || a == 'I') {
                System.out.print(a);
            }
        }
    }
}
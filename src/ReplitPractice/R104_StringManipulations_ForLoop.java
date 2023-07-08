package ReplitPractice;
/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.  */
import java.util.Scanner;

public class R104_StringManipulations_ForLoop {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name");
            names[i] = arr.nextLine();
        }
        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }
    }
}

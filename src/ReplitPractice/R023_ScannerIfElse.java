package ReplitPractice;

import java.util.Scanner;

public class R023_ScannerIfElse {
    public static void main(String[] args) {
        /* Create a program that will ask a user to input boolean value "Input the boolean value"
              If the input is true or false, then the output should look like below:  */
        Scanner user = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean value = user.nextBoolean();
        if (value) {
            System.out.println("The value is " + true);
        } else {
            System.out.println("The value is " + false);
        }
    }
}


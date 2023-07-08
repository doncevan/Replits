package ReplitPractice;

import java.util.ArrayList;
import java.util.Scanner;
    /*   Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line.
                             Numbers in: 4, 62, 8, 5, 4     */
public class Replit188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter 5 numbers and press enter after each-one");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
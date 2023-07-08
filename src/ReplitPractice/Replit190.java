package ReplitPractice;

import java.util.LinkedList;
    /*      Create Linked List that will store first 10 numbers of fibonacci series.
            Print number from Linked List 1 by 1 all in 1 line.      */
public class Replit190 {
    public static void main(String[] args) {
        LinkedList<Integer> fibonacci = new LinkedList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < 10; i++) {
            int a = fibonacci.get(i - 2);
            int b = fibonacci.get(i - 1);
            fibonacci.add(a + b);
        }
        for (Integer number : fibonacci) {
            System.out.print(number + " ");
        }
    }
}

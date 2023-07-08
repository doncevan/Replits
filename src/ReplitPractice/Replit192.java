package ReplitPractice;

import java.util.Iterator;
import java.util.LinkedList;
    /*  Create an Linked List that will store all prime numbers from 1 to 100.
        Step 1. Create a method that will identify whether number is prime or not
        Step 2. Add all prime numbers into Linked List. Print Linked List.   */
public class Replit192 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> primes = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
}
package ReplitPractice;

import java.util.LinkedList;
        /*  Create a Linked List that will store Integer Objects from 50-100.
        Once Linked List is created remove all numbers that are not divisible by 3. Print Linked List  */
public class Replit189 {
    public static void main(String[] args) {
        LinkedList<Integer> objects = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            objects.add(i);
        }
        objects.removeIf(x -> x % 3 != 0);
        System.out.println(objects);
    }
}

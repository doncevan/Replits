package ReplitPractice;

import java.util.HashSet;
import java.util.Set;

/*
    Create a set collection in which you do not want to preserve or sort the order and add below values to it.
    Red, Pink, Yellow, White, Black. Print set collection. And get total number of colors available in the set
    */
public class Replit197 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Pink");
        set.add("Yellow");
        set.add("White");
        set.add("Black");
        System.out.println("Original Hash Set: " + set);
        System.out.println("Size of the Hash Set: " + set.size());
    }
}

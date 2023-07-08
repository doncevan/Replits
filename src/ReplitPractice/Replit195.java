package ReplitPractice;
/*
    Create the HashSet with list of Integers add the below numbers for the list
    */
import java.util.HashSet;

import java.util.Set;

public class Replit195 {

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(999);
        list.add(999);
        list.add(999);
        for (var i : list) {
            System.out.println(i);
        }
    }
}

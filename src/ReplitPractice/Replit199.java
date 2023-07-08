package ReplitPractice;
/*
    Create a Set collection in which you want to preserve an order of inserted String Objects.
    Add the below values: null, Sohil, Diego, Alijon, Asel, Sumair.
    Print values 1 by 1 using loop and Iterator
    */
import java.util.LinkedHashSet;
import java.util.Set;

public class Replit199 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("null");
        set.add("Sohil");
        set.add("Diego");
        set.add("Alijon");
        set.add("Asel");
        set.add("Sumair");

        for (String s : set) {
            System.out.println(s);
        }
        var iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

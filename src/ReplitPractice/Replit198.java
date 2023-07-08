package ReplitPractice;

import java.util.Set;
import java.util.TreeSet;

/*
    Create Set to store String Objects and you want them to be stored in ascending order.
    Please add the below values and see the result:"India", "Australia", "South Africa", "India", "America", "America"
        Print the Set.
        */
public class Replit198 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");
        countries.add("America");
        countries.add("America");
        System.out.println(countries);
    }
}

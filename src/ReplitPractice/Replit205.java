package ReplitPractice;

import java.util.HashMap;
import java.util.Map;

/*
    Create a HashMap of String. Add below pairs to it .
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
        Print all the values in upper case using entrySet    */
public class Replit205 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United State");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getValue().toUpperCase());
        }
    }
}

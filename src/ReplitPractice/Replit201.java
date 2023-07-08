package ReplitPractice;

import java.util.HashMap;
import java.util.Map;

/*
    Create a Map in which you do not need to preserve the order of the entries. Add below pairs to it:
    "Street" = "Patrick ST"
    "Suite" = "265"
    "City" = "Vienna"
    "Zip" = "22180"
    "Country" = "United State"
    Find how many entries are inside the map
    Remove all entries from the Map
    Find the Map size again               */
public class Replit201 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United States");
        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());
    }
}

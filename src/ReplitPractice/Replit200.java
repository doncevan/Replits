package ReplitPractice;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Create A Map that will preserve an order of entry objects. Add below pairs :
    "Street" = "Patrick ST"
    "Suite" = "265"
    "City" = "Vienna"
    "Zip" = "22180"
    "Country" = "United State"
    Print all values of from the map
    */
public class Replit200 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United States");
        for (String v : map.values()) {
            System.out.println(v);
        }
    }
}

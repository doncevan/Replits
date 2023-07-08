package ReplitPractice;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Create a Map that will preserve an order of entry objects. Add below pair to it:
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
        Print all values using iterator.    */
public class Replit204 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Street", "Patrick ST");
        map.put("Suite", "265");
        map.put("City", "Vienna");
        map.put("Zip", "22180");
        map.put("Country", "United States");
        var iterator = map.entrySet().iterator(); //  Iterator<Map.Entry<String, Integer>> iterator=
        while (iterator.hasNext()) {
            var entry = iterator.next(); //  Map.Entry<String, Integer> entry=
            System.out.println(entry.getValue());
        }
    }
}

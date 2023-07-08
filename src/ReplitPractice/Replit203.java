package ReplitPractice;

import java.util.HashMap;
import java.util.Map;

/*
    Create HashMap, add values as below:
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        Using iterator retrieve all keys and values in specified format.   */
public class Replit203 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        var iterator = map.entrySet().iterator(); //  Iterator<Map.Entry<String, Integer>> iterator=
        while (iterator.hasNext()) {
            var entry = iterator.next(); //  Map.Entry<String, Integer> entry=
            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
        }
    }
}

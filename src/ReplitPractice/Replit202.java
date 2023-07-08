package ReplitPractice;

import java.util.Map;
import java.util.TreeMap;

/*
    Create Map in which we want to store keys in Ascending order. Add the below values:
        1 item = apple
        2 item = banana
        3 item = pear
        4 item = tomato
        5 item = mango
        6 item: kiwi        Extract all keys and it's values and print them.        */
public class Replit202 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("1 item", "apple");
        map.put("2 item", "banana");
        map.put("3 item", "pear");
        map.put("4 item", "tomato");
        map.put("5 item", "mango");
        map.put("6 item", "kiwi");
        for (var entry : map.entrySet()) {
            System.out.println("Key is " + entry.getKey() + " and values is " + entry.getValue());
        }
    }
}

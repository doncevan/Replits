package ReplitPractice;
/*
    Create Hash Map. Using EntrySet print the key and values pairs using iterator only replace with below key:
     THREE--> ASEL and key FIVE-->SUMAIR
    Using EntrySet print the key and values pairs using iterator only.
                                                                            */

import java.util.HashMap;
import java.util.Map;

public class Replit207 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Replace :");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------");
        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        var iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            var entry = iterator1.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
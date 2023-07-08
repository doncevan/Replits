package ReplitPractice;

public class Replit135 {
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); //"techn(o)l(o)gy"
    }

    static String surround(String s, String search_term) {
        return s.replaceAll(search_term, "(" + search_term + ")");
    }
}

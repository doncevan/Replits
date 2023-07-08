package ReplitPractice;

public class Replit139 {
    public static String alphabetical(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) > str.charAt(i - 1)) {

                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}

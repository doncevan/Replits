package ReplitPractice;

public class Replit131 {
    public static String thirdLetter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 3) {
            result += s.charAt(i);
        }
        return result;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

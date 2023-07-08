package ReplitPractice;

public class R118_JavaMethods {
    public static String spaceOut(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
    }
}


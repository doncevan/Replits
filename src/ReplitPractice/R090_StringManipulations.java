package ReplitPractice;
/*
Create a String named s1 = "hello" check weather string is empty or not
Create a String named s2 = "" check weather string is empty or not
Expected Output:
**false**
**true**
*/
public class R090_StringManipulations {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.isBlank());

        String s2 = "";
        System.out.println(s2.isBlank());
    }
}

package ReplitPractice;
        /*Create an instance final method that will reverse a String and return that new String
        Call method from the main method   **Expected Output:    ** olleh  */
public class Replit168 {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse("hello"));
    }
}
class ReverseString{
    public final String reverse(String a){
        StringBuilder sb=new StringBuilder(a);
        return sb.reverse().toString();
    }
}

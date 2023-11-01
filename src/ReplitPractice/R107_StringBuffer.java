package ReplitPractice;

/*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
Expected Output:
sdneirF olleH
*/
public class R107_StringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello Friends");
        System.out.println(str.reverse());
//****************************************
        //String text = "Hello Friends";
        StringBuilder stringBuilder = new StringBuilder("Hello Friends");
        System.out.println(stringBuilder.reverse());
    }
}

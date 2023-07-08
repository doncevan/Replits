package ReplitPractice;
/*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
Expected Output:
Welcome Syntax family
*/
public class R098_StringManipulations {
    public static void main(String[] args) {
        String given = "Hello Syntax friends";
        given = given.replace("Hello", "Welcome");
        System.out.println(given.replace("friends", "family"));
    }
}
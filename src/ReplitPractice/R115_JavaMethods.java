package ReplitPractice;
/*
Create a method that will accept a String as a parameter and return new String all
in upper case Call the method */
public class R115_JavaMethods {
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(toUpperCase("test"));
    }
}

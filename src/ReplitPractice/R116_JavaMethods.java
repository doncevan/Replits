package ReplitPractice;
/*
Create a method that will accept 2 numbers as parameters and return true if both
numbers are even otherwise returned false */
public class R116_JavaMethods {
    public static boolean bothEven(int a, int b) {
        return a % 2 == 0 && b % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(bothEven(3, 4));
    }
}

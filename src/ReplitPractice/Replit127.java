package ReplitPractice;

import com.sun.tools.javac.Main;

public class Replit127 {
    public void printNonStatic() {
        System.out.println("Programming is amazing.");
    }

    public static void printStatic() {
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        Replit127 obj = new Replit127();
        obj.printNonStatic();
        Replit127.printStatic();
    }
}

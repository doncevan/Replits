package ReplitPractice;

    /*Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
    Make Main class to be a derived class from Parent. In main method execute both methods.  */

public class Replit172 extends Parent172 {
    public static void main(String[] args) {
        Replit172 repl = new Replit172();
        repl.m1();
        repl.m2();
    }
    @Override
    public void m1() {
        System.out.println("Child class providing implementation");
    }
}

abstract class Parent172 {
    public void m2() {
        System.out.println("Parent class providing implementation");
    }

    public abstract void m1();
}

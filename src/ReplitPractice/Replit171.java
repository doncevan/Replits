package ReplitPractice;

    /*Create a Parent Class that will have two overloaded abstract methods m1
    Make Main class as concrete subclass to Parent Class
    In main method call the methods. **Expected Output: m1 without parameters
                                                        m1 method with parameter   */

public class Replit171 extends Parent171 {
    public static void main(String[] args) {
        Replit171 x = new Replit171();
        x.m1();
        x.m1(10);
    }

    @Override
    public void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    public void m1(int a) {
        System.out.println("m1 method with parameter");
    }
}

abstract class Parent171 {
    public abstract void m1();

    public abstract void m1(int a);
}
package ReplitPractice;

    /*Create an Interface with name as MyInterface. Create two undefined methods method1 and method2.
    Inherit the MyInterface to Main Class.  Execute both methods   */

public class Replit174 implements MyInterface {
    public void method1() {
        System.out.println("implementation of method1");
    }

    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        MyInterface obj = new Replit174();
        obj.method1();
        obj.method2();
    }
}

interface MyInterface {
    void method1();

    void method2();

}

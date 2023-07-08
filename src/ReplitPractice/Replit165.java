package ReplitPractice;

    /* Parent class create 4 methods with different level of access modifiers. In each method print
    "I am parent public/protected/default/private method". Override methods in child class
    In Main Class create object of the child class and see which methods are available  */

public class Replit165 {
    public static void main(String[] args) {
        Child165 obj = new Child165();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}

class Parent165 {
    public void display1() {
        System.out.println("I am a parent public method");
    }

    protected void display2() {
        System.out.println("I am a parent protected method");
    }

    void display3() {
        System.out.println("I am a parent protected method");
    }

    private void display4() {
        System.out.println("I am a parent private method");
    }
}

class Child165 extends Parent165 {
    @Override
    public void display1() {
        System.out.println("I am a child public method");
    }

    @Override
    protected void display2() {
        System.out.println("I am a child protected method");
    }

    @Override
    void display3() {
        System.out.println("I am a child default method");
    }

    private void display4() {
        System.out.println("I am a child private method");
    }
}

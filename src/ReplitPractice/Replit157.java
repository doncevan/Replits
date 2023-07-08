package ReplitPractice;

public class Replit157 {
    public static void main(String[] args) {
        Child157 child157 = new Child157();
        child157.m2();
    }
}

class Parent157 {
    void m1() {
        System.out.println("m1 method in parent class");
    }
}

class Child157 extends Parent157 {
    @Override
    void m1() {
        System.out.println("m1 method in child class");
    }

    void m2() {
        m1();
        super.m1();
    }
}
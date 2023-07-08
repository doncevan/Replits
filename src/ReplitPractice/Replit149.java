package ReplitPractice;

public class Replit149 {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}

class A {
    void print() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void print() {
        super.print();
        System.out.println("Class B");
    }
}
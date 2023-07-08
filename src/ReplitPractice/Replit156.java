package ReplitPractice;

public class Replit156 {
    public static void main(String[] args) {
        B156 b156 = new B156();
        b156.display();
    }
}

class A156 {
    int i = 10;
}

class B156 extends A156 {
    int i = 20;

    void display() {
        System.out.println(i);
        System.out.println(super.i);
    }
}
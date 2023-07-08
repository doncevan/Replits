package ReplitPractice;

public class Replit154 {
    public static void main(String[] args) {
        Child154 childA = new Child154();
        Child154 childB = new Child154(10);
    }
}

class Parent154 {
    public Parent154() {
        System.out.println("Parent Constructor without argument");
    }

    public Parent154(int number) {
        System.out.println(number);
    }
}

class Child154 extends Parent154 {
    public Child154() {
        System.out.println("Child Constructor without argument");
    }

    public Child154(int number) {
        super(number);
    }
}
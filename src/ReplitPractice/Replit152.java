package ReplitPractice;

public class Replit152 {
    public static void main(String[] args) {
        Child child = new Child("Vienna");
    }
}

class Parent {
    public Parent(String city) {
        System.out.println(city);
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    public Child(String city) {
        super(city);
    }
}
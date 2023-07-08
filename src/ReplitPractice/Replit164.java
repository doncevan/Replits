package ReplitPractice;

    /* Create a method hello() in parent class that will print "method in Parent class" then override  that method
     in 3 Subclasses implementing logic to print "method in Child1/Child2/Child3 class"
    In Main Class create 3 object of the child classes and store it into an array and call method hello()  */

public class Replit164 {
    public static void main(String[] args) {
        Parent164 obj[] = {new ChildA(), new ChildB(), new ChildC()};
        for (Parent164 x : obj) {
            x.hello();
        }
    }
}

class Parent164 {
    void hello() {
        System.out.println("method in Parent class");
    }
}

class ChildA extends Parent164 {
    @Override
    void hello() {
        System.out.println("method in Child1 class");
    }
}

class ChildB extends Parent164 {
    @Override
    void hello() {
        System.out.println("method in Child2 class");
    }
}

class ChildC extends Parent164 {
    @Override
    void hello() {
        System.out.println("method in Child3 class");
    }
}
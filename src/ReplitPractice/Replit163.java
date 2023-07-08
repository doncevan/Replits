package ReplitPractice;

    /*  In Parent Class create a method with name method() that will print  "Parent method"
    Override method() in Child class that will print "Child method"
    In Main Class create objects of child and parent class and call its method.
    **Expected Output:** Parent method
                          Child method  */
public class Replit163 {
    public static void main(String[] args) {
        Parent163 obj1 = new Parent163();
        obj1.method();
        Child163 obj2 = new Child163();
        obj2.method();
    }
}

class Parent163 {
    void method() {
        System.out.println("Parent method");
    }
}

class Child163 extends Parent163 {
    @Override
    void method() {
        System.out.println("Child method");
    }
}
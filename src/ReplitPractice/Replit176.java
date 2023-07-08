package ReplitPractice;

    /*  Create Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.
    Create an Interface as ChildInterface that will be a child interface of Parent Interface and will have a method childMethod without parameters.
    Inherit the Main class to Child Interface.
    Execute both methods   */
public class Replit176 implements ChildInterface {
    public static void main(String[] args) {
        ChildInterface obj = new Replit176();
        obj.parentMethod();
        obj.childMethod();
    }

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

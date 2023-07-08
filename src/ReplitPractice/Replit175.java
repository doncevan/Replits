package ReplitPractice;

/*   Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)
Inherit both interfaces to Main class.  Execute both methods   */
public class Replit175 implements FirstInterface, SecondInterface {
    public static void main(String[] args) {
        FirstInterface obj = new Replit175();
        SecondInterface obj1 = new Replit175();
        obj.firstMethod();
        obj1.secondMethod();
    }

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}

interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}

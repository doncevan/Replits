package ReplitPractice;

/*Overload private instance method m1 Call each method from the main method. Expected Output:
``` private m1 method private m1 method with int parameter*/
public class Replit161 {
    public static void main(String[] args) {
        Replit161 main = new Replit161();
        main.m1();
        main.m1(10);
    }

    private void m1() {
        System.out.println("private m1 method");
    }

    private void m1(int a) {
        System.out.println("private m1 method with int parameter");
    }
}

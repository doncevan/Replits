package ReplitPractice;

/*Overload instance method display by having different types of parameters Inside each method write the logic
 to print value of the parameter Call all methods inside your main method*/
public class Replit160 {
    public static void main(String[] args) {
        Replit160 repl= new Replit160();
        repl.display(100);
        repl.display("Syntax Technologies");
        repl.display(100.09);
    }

    public void display(int a) {
        System.out.println(a);
    }

    public void display(String s) {
        System.out.println(s);
    }

    public void display(double d) {
        System.out.println(d);
    }
}

package ReplitPractice;
    /*Overload 2 final instance methods:  Call them in main method   **Expected Output:
                    Final method with boolean parameter
                    Final method with String parameter   */
public class Replit170 {
    public static void main(String[] args) {
        FinalMethods fm = new FinalMethods();
        fm.display(true);
        fm.display("hi");
    }
}

class FinalMethods {
    final void display(boolean b) {
        System.out.println("Final method with boolean parameter");
    }

    final void display(String s) {
        System.out.println("Final method with String parameter");
    }
}

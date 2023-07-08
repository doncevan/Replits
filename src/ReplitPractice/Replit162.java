package ReplitPractice;

/*Overload static method and then execute both overloaded methods.
 *  **Expected Output:**  **static method without parameter ***  static method with int parameter   */
public class Replit162 {
    public static void main(String[] args) {
        Replit162 obj = new Replit162();
        obj.method();
        obj.method(10);
    }

    static void method() {
        System.out.println("static method without parameter");
    }

    static void method(int a) {
        System.out.println("static method with int parameter");
    }
}

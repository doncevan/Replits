package ReplitPractice;

/*Complete the code, handle possible exception
        **Expected Output:**
                / by zero       */
public class Replit210 {
    public static void main(String[] args) {
        int a = 10, b = 0, result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

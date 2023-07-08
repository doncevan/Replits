package ReplitPractice;

/*Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers In main method execute all 3 methods to match the output:
 Expected Output ``` 40 (should come from subtracting 4 numbers) 30 (should come from subtracting 3 numbers) ```
 ``` 20 (should come from subtracting 2 numbers) ```*/
public class Replit159 {
    public static void main(String[] args) {
        System.out.print(substract(100, 30, 20, 10));
        System.out.println(" (should come from subtracting 4 numbers)");
        System.out.print(substract(100, 40, 30));
        System.out.println(" (should come from subtracting 3 numbers)");
        System.out.print(substract(100, 80));
        System.out.println(" (should come from subtracting 2 numbers)");
    }

    public static int substract(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public static int substract(int a, int b, int c) {

        return a - b - c;
    }

    public static int substract(int a, int b) {
        return a - b;
    }
}
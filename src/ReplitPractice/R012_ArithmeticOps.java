package ReplitPractice;

public class R012_ArithmeticOps {
    public static void main(String[] args) {
        /*1. Add num1 and num2   2. Divide the result by num3   3. Subtract num4 from that result
       Instructions: Please use variables to assign the result of arithmetic operations
                        The result of arithmetic operations is equal to ___   */
        int num1 = 3;
        int num2 = 7;
        int num3 = 5;
        int num4 = 1;

        int addition = num1 + num2;
        int division = addition / num3;
        int subtraction = division - num4;
        System.out.println("The result of arithmetic operations is equal to " + subtraction);
    }
}

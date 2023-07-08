package ReplitPractice;
/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
for the addition method add two numbers to make 30
for multiplication multiply two numbers to make 30
for Subtraction subtract two numbers to equal 20
Expected Output:
Addition 30
Multiplication 30
Subtraction 20
*/
public class R114_JavaMethods {
    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Addition " + addition(15, 15));
        System.out.println("Multiplication " + multiplication(3, 10));
        System.out.println("Subtraction " + subtraction(30, 10));
    }
}

package ReplitPractice;

public class R049_WhilePrintString {
    public static void main(String[] args) {
        // Write a java program to print  "Hello Syntax Team! How are you?"  three times using the while loop
        int num = 0;
        while (num != 3) {
            System.out.println("Hello Syntax Team! How are you?");
            num++;
        }
        // same outcome with opposite way numbers; numbers could be any with difference:3(0--3;1--4;2--5)
        System.out.println("----------------------------------");
        int num1 = 3;
        while (num1 != 0) {
            System.out.println("Hello Syntax Team! How are you?");
            num1--;
        }
    }
}

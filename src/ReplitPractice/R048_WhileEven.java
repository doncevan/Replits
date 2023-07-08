package ReplitPractice;

public class R048_WhileEven {
    public static void main(String[] args) {
        // Using while loops that print out even numbers from 1 to 13
        int num = 1;
        while (num <= 13) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}

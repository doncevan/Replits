package ReplitPractice;

public class R070_Arrays {
    public static void main(String[] args) {
        /* Write a program that creates an array of integers and stores the following values:
        45, 78, 12,  67, 55  and then prints all array values.  */
        int[] values = {45, 78, 12, 67, 55};
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}

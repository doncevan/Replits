package ReplitPractice;

public class Replit141 {
    public static int maxValue(int[] numbers) {
        int largestNumber = 0;
        for (int num : numbers) {
            if (num > largestNumber) {
                largestNumber = num;
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr));
    }
}

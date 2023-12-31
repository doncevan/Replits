package ReplitPractice;
    /*Create final method avgElements that will average all the elements in an integer array
    (passed to the method as a parameter) and return the average.   */
public class Replit169 {
    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }

    static final double avgElements(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}

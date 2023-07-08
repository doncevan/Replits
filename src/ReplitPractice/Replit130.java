package ReplitPractice;

public class Replit130 {
    public static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            } else {
                array[i] = array[i] * 10;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        mystery(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

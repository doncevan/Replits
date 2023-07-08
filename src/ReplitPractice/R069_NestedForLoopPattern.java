package ReplitPractice;

public class R069_NestedForLoopPattern {
    public static void main(String[] args) {
        /* Write a program to print out the pattern:
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7   */
        for (int row = 0; row < 6; row++) {
            for (int col = 1; col < 8 - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = 1; row < 9; row++) {
            if (row == 1) {
                continue;
            }
            for (int col = 1; col < row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}

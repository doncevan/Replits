package ReplitPractice;

public class R068_NestedForLoopPattern {
    public static void main(String[] args) {
/*  Write a program to print out the pattern: $$$$
                                              $  $
                                              $  $
                                              $$$$   */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || j == 3 || i == 3 || j == 0) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
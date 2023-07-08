package ReplitPractice;

public class R073_Arrays {
    public static void main(String[] args) {
    /* Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"}
        and prints all values in one line. */
        String[] words = {"This", "is", "array", "of", "strings"};
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

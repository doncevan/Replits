package ReplitPractice;
    /*Create a method that will not be handling exception and throwing it at caller.
    In main method call method and handle the exception.
                **Expected Output:**
        java.io.FileNotFoundException:  (No such file or directory)      */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Replit212 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("(No such file or directory)");
        new FileReader(file);
    }
}

package ReplitPractice;

    /*   Create a method that will do temperature check. Anytime user passes temperature that is below 32 method
    should throw an Exception saying "It is freezing". In Main method call the method and handle an Exception
                **Expected Output:**
        java.lang.RuntimeException: It is freezing                               */
public class Replit213 {
    public static void main(String[] args) {
        try {
            checkTemperature(30);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void checkTemperature(int temperature) {
        if (temperature < 32) {
            throw new RuntimeException("It is freezing");
        }
    }
}

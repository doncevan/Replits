package ReplitPractice;
/*
Based on the user inputs program should give a correct answer.
If browser is Chrome, or CHROME, or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
*/
import java.util.Scanner;

public class R097_StringManipulations_NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();
        browser = browser.toLowerCase();

        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Proceed with " + browser.replaceFirst("c", "C") + " browser");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Proceed with " + browser.replaceFirst("f", "F") + " browser");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.out.println("Proceed with " + browser.replaceFirst("ie", "IE") + " browser");
        } else {
            System.out.println("Invalid browser");
        }
    }
}

package ReplitPractice;

import java.util.Scanner;

public class R044_SwitchScan {
    public static void main(String[] args) {
        /* Prompt user with questions: "Please enter your favorite car make"
            - if user enters  BMW -->  carOrigin = "german car"
            - if user enters  Toyota -->  carOrigin = " japanese car"
            - if user enters  Maserati -->  carOrigin = "italian car"
            - anything else besides those values --> carOrigin = "unknown" */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin = scan.nextLine();
        switch (carOrigin) {
            case "BMW" -> System.out.println("Your favorite car is german car");
            case "Toyota" -> System.out.println("Your favorite car is japanese car");
            case "Maserati" -> System.out.println("Your favorite car is italian car");
            default -> System.out.println("Your favorite car is unknown");
        }
    }
}

package ReplitPractice;

import java.util.Scanner;

public class R037_LogicalOpsElseIf {
    public static void main(String[] args) {
        /* Take 2 boolean inputs from a user:   "Are you thirsty?",   "Are you sleepy?"
            If user is thirsty and not sleepy--> drink=water
            If user is thirsty and sleepy--> drink=coffee
            If user is not thirsty and sleepy --> drink=tea      Otherwise drink="nothing" */
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();
        if (thirsty && !sleepy) {
            System.out.println("Drink water");
        } else if (thirsty) {
            System.out.println("Drink coffee");
        } else if (sleepy) {
            System.out.println("Drink tea");
        } else {
            System.out.println("Drink nothing");
        }
    }
}

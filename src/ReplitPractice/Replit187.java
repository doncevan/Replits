package ReplitPractice;

import java.util.ArrayList;
    /*  Create an array list to type String. Add these values below to your arraylist:hi, yo, sup, yolo, boop.
    Remove 1, 3, 5 element from an array. Print remained values one by one in one line.   */
public class Replit187 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");

        list.remove(0);
        list.remove(1);
        list.remove(2);

        for (String s : list) {
            System.out.print(s + " ");

        }
    }
}


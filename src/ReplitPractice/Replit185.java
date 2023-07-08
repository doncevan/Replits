package ReplitPractice;

import java.util.ArrayList;

    /*  #ArrayList
     Create an arrayList of type Integer, add below values: 111, 111, 111, 999, 999, 999.
        Print all the values of List 1 by 1  */
public class Replit185 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(999);
        arrayList.add(999);
        arrayList.add(999);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}

package ReplitPractice;

import java.util.ArrayList;

    /*    Create a array list that will hold Integer Objects: Add below elements to it.
    ***111; 222; 333; 444; 555; 666;     Print first, third and fifth element from your array  */
public class Replit184 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(4));

        /*         OR
        arrayList.removeIf(x -> x % 2 == 0);
        for (Integer integer : arrayList) {
            System.out.println(integer);}     */
    }
}


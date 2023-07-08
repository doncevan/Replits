package ReplitPractice;

public class R104_StringManipulations_ForLoopWithoutScan {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jimmy", "Mike", "Emily"};
        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }
    }
}

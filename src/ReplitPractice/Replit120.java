package ReplitPractice;

public class Replit120 {

    int year;
    String schoolName;
    int batchNumber;

    public static void main(String[] args) {
        Replit120 myClass = new Replit120();
        myClass.year = 2023;
        myClass.schoolName = "Syntax";
        myClass.batchNumber = 16;

        System.out.println("I am a student of batch " + myClass.batchNumber + " studying at " + myClass.schoolName + " in the year of " + myClass.year);
    }
}

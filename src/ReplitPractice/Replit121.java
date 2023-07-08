package ReplitPractice;

public class Replit121 {
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        Replit121 myClass1 = new Replit121();
        myClass1.intValue = 10;
        myClass1.doubleValue = 10.23;
        myClass1.charValue = 'a';

        Replit121 myClass2 = new Replit121();
        myClass2.intValue = 100;
        myClass2.doubleValue = 100.23;
        myClass2.charValue = 's';

        System.out.println(myClass1.intValue);
        System.out.println(myClass1.doubleValue);
        System.out.println(myClass1.charValue);
        System.out.println(myClass2.intValue);
        System.out.println(myClass2.doubleValue);
        System.out.println(myClass2.charValue);
    }
}

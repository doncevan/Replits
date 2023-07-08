package ReplitPractice;

public class Replit137 {
    private String name;
    String city;
    protected String school;
    public int batchNumber;

    public void display() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + school + " in batch " + batchNumber);
    }

    public static void main(String[] args) {
        Replit137 student = new Replit137();
        student.name = "John";
        student.city = "Miami";
        student.school = "Syntax";
        student.batchNumber = 9;
        student.display();
    }
}
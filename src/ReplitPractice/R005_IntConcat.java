package ReplitPractice;

public class R005_IntConcat {
    public static void main(String[] args) {
        /*- Create a String variable "name" and assign a value of "Chen" to it
- Create an integer variable "age" and assign a value of 50 to it
- Create an integer variable "iq" and assign the value of age to it (do NOT use ' = 50')
- Print the value of a name
- Print the value of "age" and the value of "iq" on the same line. */
        String name = "Chen";
        int age = 50;
        int iq;
        iq = age;
        System.out.println(name);
        System.out.println(age + "" + iq);
    }
}

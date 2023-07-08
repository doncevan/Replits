package ReplitPractice;

public class Replit150 {
    public static void main(String[] args) {
        Employee1 employee = new Employee1("Joe", "Smith", 35, 35000);
        employee.print();

        Student student = new Student("Adam", "Smith", 15, 0, 10);
        student.print();

        Retiree retiree = new Retiree("Frank", "Smith", 15, 0, 0, "tour");
        retiree.print();
    }
}

class Person {
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

class Employee1 extends Person {
    int salary;

    public Employee1(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void print() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class Student extends Employee1 {
    int grade;

    public Student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary);
        this.grade = grade;
    }

    public void print() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}

class Retiree extends Student {
    String seniorActivity;

    public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }

    public void print() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}
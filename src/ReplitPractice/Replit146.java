package ReplitPractice;

public class Replit146 {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.display();
        Employee obj2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        obj2.display();
    }
}

class Employee {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    public Employee() {

    }

    public Employee(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + " " + lastName + " " + employeeId + " " + startDate + " " + salary);
    }
}
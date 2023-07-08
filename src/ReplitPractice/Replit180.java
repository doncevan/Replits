package ReplitPractice;
    /* Create Class EncapsulationDemo, create two variable as shown below: private String empName=John;
      private int empAge=30; Create only getters methods for each variable.  Print the values of each variable as shown below. */
public class Replit180 {
    public static void main(String[] args) {
        EncapsulationDemo2 a = new EncapsulationDemo2();
        System.out.println("Employee Name: " + a.getEmpName());
        System.out.println("Employee Age: " + a.getEmpAge());
    }
}

class EncapsulationDemo2 {
    private String empName = "John";
    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}

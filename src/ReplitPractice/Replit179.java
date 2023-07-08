package ReplitPractice;

public class Replit179 {
    public static void main(String[] args) {
        EncapsulationDemo1 a = new EncapsulationDemo1();
        a.setEmpName("Mario");
        System.out.println("Employee Name: " + a.getEmpName());
        a.setEmpAge(32);
        System.out.println("Employee Age: " + a.getEmpAge());
    }
}

class EncapsulationDemo1 {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

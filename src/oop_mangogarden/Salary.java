
package oop_mangogarden;

public class Salary extends Employee{
    private int salary;

//    public Salary(String employeeType, String employeeName, int employeeID) {
//        super(employeeType, employeeName, employeeID);
//    }

    public Salary(int salary, String employeeType, String employeeName, int employeeID) {
        super(employeeType, employeeName, employeeID);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" + super.toString() + "salary=" + salary + '}';
    }
    
    
    
}

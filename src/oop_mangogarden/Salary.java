
package oop_mangogarden;

public class Salary extends Employee{
    private int salary;

//    public Salary(String employeeType, String employeeName, int employeeID) {
//        super(employeeType, employeeName, employeeID);
//    }


    public Salary(int salary) {
        this.salary = salary;
    }

    public Salary(int salary, String employeeType, String employeeName, int employeeID, String gender, String contactNumber) {
        super(employeeType, employeeName, employeeID, gender, contactNumber);
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
        return "Salary{" + "salary=" + salary + '}';
    }

    
    
    
    
}

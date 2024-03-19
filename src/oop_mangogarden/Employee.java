
package oop_mangogarden;

public class Employee {
    private String employeeType;
    private String employeeName;
    private int employeeID;

    public Employee(String employeeType, String employeeName, int employeeID) {
        this.employeeType = employeeType;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeType=" + employeeType + ", employeeName=" + employeeName + ", employeeID=" + employeeID + '}';
    }
    
    
    
    
}


package oop_mangogarden;

public class Employee {
    private String employeeType;
    private String employeeName;
    private int employeeID;
    private String gender;
    private String contactNumber;
    

    public Employee() {
    }

    public Employee(String employeeType, String employeeName, int employeeID, String gender, String contactNumber) {
        this.employeeType = employeeType;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.gender = gender;
        this.contactNumber = contactNumber;
        
        
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeType=" + employeeType + ", employeeName=" + employeeName + ", employeeID=" + employeeID + ", gender=" + gender + ", contactNumber=" + contactNumber + '}';
    }

    


    
    
    
    
}

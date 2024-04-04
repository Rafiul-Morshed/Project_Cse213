
package oop_mangogarden;

public class Vehicle {
    private String chassisNo;
    private String plateNo;

    public Vehicle(String chassisNo, String plateNo) {
        this.chassisNo = chassisNo;
        this.plateNo = plateNo;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "chassisNo=" + chassisNo + ", plateNo=" + plateNo + '}';
    }
    
    
    
}

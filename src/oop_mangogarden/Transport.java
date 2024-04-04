
package oop_mangogarden;

public class Transport extends Vehicle{
    private String DriverName;
    private String productID;
    private String dispatchDate;
    private String destination;

    public Transport(String DriverName, String productID, String dispatchDate, String destination, String chassisNo, String plateNo) {
        super(chassisNo, plateNo);
        this.DriverName = DriverName;
        this.productID = productID;
        this.dispatchDate = dispatchDate;
        this.destination = destination;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(String dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Transport{" + "DriverName=" + DriverName + ", productID=" + productID + ", dispatchDate=" + dispatchDate + ", destination=" + destination + '}';
    }
    
    
    
    
}


package oop_mangogarden;

public class Bill {
    private String clientName;
    private String address;
    private int issueDate;
    private String productname;
    private int quantity;
    private int invoiceNo;
    private Float totalPrice;    

    public Bill() {
    }

    public Bill(String clientName, String address, int issueDate, String productname, int quantity, int invoiceNo, Float totalPrice) {
        this.clientName = clientName;
        this.address = address;
        this.issueDate = issueDate;
        this.productname = productname;
        this.quantity = quantity;
        this.invoiceNo = invoiceNo;
        this.totalPrice = totalPrice;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Bill{" + "clientName=" + clientName + ", address=" + address + ", issueDate=" + issueDate + ", productname=" + productname + ", quantity=" + quantity + ", invoiceNo=" + invoiceNo + ", totalPrice=" + totalPrice + '}';
    }

    
    
}

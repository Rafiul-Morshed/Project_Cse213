
package oop_mangogarden;

public class SaleInfo {
    private String costomername;
    private String invoiceNo;
    private String productName;
    private String saleDate;
    private String totalPrice;

    public SaleInfo(String costomername, String invoiceNo, String productName, String saleDate, String totalPrice) {
        this.costomername = costomername;
        this.invoiceNo = invoiceNo;
        this.productName = productName;
        this.saleDate = saleDate;
        this.totalPrice = totalPrice;
    }

    public String getCostomername() {
        return costomername;
    }

    public void setCostomername(String costomername) {
        this.costomername = costomername;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "SaleInfo{" + "costomername=" + costomername + ", invoiceNo=" + invoiceNo + ", productName=" + productName + ", saleDate=" + saleDate + ", totalPrice=" + totalPrice + '}';
    }
    
    
    
}

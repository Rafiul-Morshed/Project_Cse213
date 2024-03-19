
package oop_mangogarden;


public class Product {
    public String productName;
    private Float price;

    public Product(String productName, Float price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductrName(String productrName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productrName=" + productName + ", price=" + price + '}';
    }
    
    
    
}

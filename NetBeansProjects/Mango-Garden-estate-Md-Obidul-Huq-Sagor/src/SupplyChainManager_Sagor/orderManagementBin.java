/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplyChainManager_Sagor;

import java.io.Serializable;

/**
 *
 * @author md.obidulhuqsagor
 */
public class orderManagementBin implements Serializable{
    private String CoustomerName;
    private String Date;
    private String quantity;
    private String product;
    private String Amount;

    public orderManagementBin(String CoustomerName, String Date, String quantity) {
        this.CoustomerName = CoustomerName;
        this.Date = Date;
        this.quantity = quantity;
        this.product = product;
        this.Amount = Amount;
    }

    public String getCoustomerName() {
        return CoustomerName;
    }

    public void setCoustomerName(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "orderManagementBin{" + "CoustomerName=" + CoustomerName + ", Date=" + Date + ", quantity=" + quantity + ", product=" + product + ", Amount=" + Amount + '}';
    }
    
    
}

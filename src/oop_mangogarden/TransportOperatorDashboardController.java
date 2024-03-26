/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package oop_mangogarden;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User-pc
 */
public class TransportOperatorDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void productinfoOnclick(ActionEvent event) throws Exception{
                        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("TransportableProductInfo.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void purchaseorderOnclick(ActionEvent event) {
    }

    @FXML
    private void issuePurchaseOnclick(ActionEvent event) {
    }

    @FXML
    private void productcatagoryOnclick(ActionEvent event) {
    }

    @FXML
    private void supplierinfoOnclick(ActionEvent event) throws Exception{
                Parent mainSceneParent = FXMLLoader.load(getClass().getResource("SupplierInfo.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void transactionOnclcik(ActionEvent event) {
    }

    @FXML
    private void paymentdiscountOnclick(ActionEvent event) {
    }

    @FXML
    private void damageadjustmentOnclick(ActionEvent event) {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager_Sagor;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author md.obidulhuqsagor
 */
public class OrderManagementController implements Initializable {

    @FXML
    private TextField customerNamefxid;
    @FXML
    private DatePicker datefxid;
    @FXML
    private ComboBox<String> quantityfxid;
    @FXML
    private ComboBox<String> productfxid;
    @FXML
    private TextField Amounfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productfxid.getItems().addAll("Langra", "Fazli", "Himsagar",
                "Khirsapat", "Gopalbhog", "Amrapali", "Ashwina",
                "Bombai", "Hari Bhanga");

        quantityfxid.getItems().addAll(
                "1Kg", "2Kg", "3Kg", "4Kg", "5Kg",
                "6Kg", "7Kg", "8Kg", "9Kg", "10Kg",
                "11Kg", "12Kg", "13Kg", "14Kg", "15Kg",
                "16Kg", "17Kg", "18Kg", "19Kg", "20Kg"
        );
    }

    @FXML
    private void omBackOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("mainSupplyChainManager.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void omAddOnClick(ActionEvent event) {
        try {
            String CustomerName = customerNamefxid.getText();
            String Quantity = quantityfxid.getValue();
            LocalDate issueDate = datefxid.getValue();
            String Product = productfxid.getValue();
            String Amount = "";

            // Automatically set the price for mangoes
            if (isMangoVariety(Product)) {
                // Assuming the price is 250 Taka per kg
                double pricePerKg = 250.0;
                int kg = Integer.parseInt(Quantity.substring(0, Quantity.length() - 2));
                double totalPrice = pricePerKg * kg;
                Amount = String.valueOf(totalPrice) + " Taka";
            }

            // Display the calculated amount or leave it empty
            Amounfxid.setText(Amount);

            if (CustomerName.isEmpty() || Quantity == null ||
                issueDate == null || Product == null || Amount.isEmpty()) {
                // Handle empty fields
            } else {
                // Save the order or perform other actions
            }
        } catch (Exception e) {
            // Handle exceptions
        }
    }

    private boolean isMangoVariety(String product) {
        String[] mangoVarieties = {"Langra", "Fazli", "Himsagar",
                "Khirsapat", "Gopalbhog", "Amrapali", "Ashwina",
                "Bombai", "Hari Bhanga"};
        for (String variety : mangoVarieties) {
            if (variety.equalsIgnoreCase(product)) {
                return true;
            }
        }
        return false;
    }

    @FXML
    private void omInventoryOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("mainSupplyChainManager.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
}

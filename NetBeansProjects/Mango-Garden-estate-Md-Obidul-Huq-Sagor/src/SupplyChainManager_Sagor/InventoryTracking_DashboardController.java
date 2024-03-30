/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager_Sagor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author md.obidulhuqsagor
 */
public class InventoryTracking_DashboardController implements Initializable {

    @FXML
    private TableView<?> ItTablefxid;
    @FXML
    private TableColumn<?, ?> datefxid;
    @FXML
    private TableColumn<?, ?> orderfxid;
    @FXML
    private TableColumn<?, ?> customerNfxid;
    @FXML
    private TableColumn<?, ?> Statusfxid;
    @FXML
    private TableColumn<?, ?> Amountfxid;
    @FXML
    private Button BackItfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackItOnAction(ActionEvent event) {
    }
    
}

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

/**
 * FXML Controller class
 *
 * @author md.obidulhuqsagor
 */
public class OrderManagementController implements Initializable {

    @FXML
    private Button backOMfxid;
    @FXML
    private Button omSubmitfxid;
    @FXML
    private TableColumn<?, ?> customerNamefxid;
    @FXML
    private TableColumn<?, ?> orderfxid;
    @FXML
    private TableColumn<?, ?> quantityfxid;
    @FXML
    private TableColumn<?, ?> statusfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOMonClick(ActionEvent event) {
    }

    @FXML
    private void omSubmitOnClick(ActionEvent event) {
    }
    
}

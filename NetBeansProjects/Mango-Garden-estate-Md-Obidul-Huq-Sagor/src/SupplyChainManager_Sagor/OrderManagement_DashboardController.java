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
public class OrderManagement_DashboardController implements Initializable {

    @FXML
    private Button BackOMfxid;
    @FXML
    private Button cNoSubmitfxid;
    @FXML
    private TableColumn<?, ?> CustomerNamefxid;
    @FXML
    private TableColumn<?, ?> Orderfxid;
    @FXML
    private TableColumn<?, ?> Quantityfxid;
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
    private void BackOMOnAction(ActionEvent event) {
    }

    @FXML
    private void cNoSubmitOnAction(ActionEvent event) {
    }
    
}
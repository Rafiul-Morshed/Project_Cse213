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
public class TransferManagementController implements Initializable {

    @FXML
    private Button backTmfxid;
    @FXML
    private TableView<?> tabelviewTmfxid;
    @FXML
    private TableColumn<?, ?> tmNamefxid;
    @FXML
    private TableColumn<?, ?> tmOrderfxid;
    @FXML
    private TableColumn<?, ?> tmFromfxid;
    @FXML
    private TableColumn<?, ?> tmTofxid;
    @FXML
    private TableColumn<?, ?> tmMovedatefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backTmOnClick(ActionEvent event) {
    }
    
}

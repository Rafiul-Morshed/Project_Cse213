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
public class TransferManagement_DashboardController implements Initializable {

    @FXML
    private Button BackTmfxid;
    @FXML
    private TableView<?> tabelviewTmfxid;
    @FXML
    private TableColumn<?, ?> TmNamefxid;
    @FXML
    private TableColumn<?, ?> TmOrderfxid;
    @FXML
    private TableColumn<?, ?> TmFromfxid;
    @FXML
    private TableColumn<?, ?> TmTofxid;
    @FXML
    private TableColumn<?, ?> TmMovedatefxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackTmOnAction(ActionEvent event) {
    }
    
}

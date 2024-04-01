/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package SupplyChainManager_Sagor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author md.obidulhuqsagor
 */
public class ReportingAndAnalyticsController implements Initializable {

    @FXML
    private TableColumn<?, ?> raaorderidfxml;
    @FXML
    private TableColumn<?, ?> raapurposefxml;
    @FXML
    private TableColumn<?, ?> raaTaskfxml;
    @FXML
    private TableColumn<?, ?> raaResultsfxml;
    @FXML
    private TableColumn<?, ?> raaValuefxml;
    @FXML
    private TableColumn<?, ?> raaamountfxml;
    @FXML
    private TextField raaOrderDdOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void raabackOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("mainSupplyChainManager.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void raaSearchOnClick(ActionEvent event) {
    }
    
}

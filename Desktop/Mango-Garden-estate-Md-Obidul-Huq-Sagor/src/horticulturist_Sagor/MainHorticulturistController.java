/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package horticulturist_Sagor;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author md.obidulhuqsagor
 */
public class MainHorticulturistController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gardenOverviewOnClick(ActionEvent event) {
    }

    @FXML
    private void monitorTreeHealthOnClick(ActionEvent event) {
    }

    @FXML
    private void recordPlantingOnClick(ActionEvent event) {
    }

    @FXML
    private void ReportingAnalyticsOnClick(ActionEvent event) {
    }

    @FXML
    private void purchasingOnClick(ActionEvent event) {
    }

    @FXML
    private void CapabilitiesOnClick(ActionEvent event) {
    }

    @FXML
    private void aboutGardenOnClick(ActionEvent event) {
    }

    @FXML
    private void FeedbackOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutHorticulturistOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Mango_Garden_Enter_Page/login.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}

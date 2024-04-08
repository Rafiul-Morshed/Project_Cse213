
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class TransportableProductInfoController implements Initializable {

    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> productnameColumn;
    @FXML
    private TableColumn<?, ?> productidColumn;
    @FXML
    private TableColumn<?, ?> orderedColumn;
    @FXML
    private TableColumn<?, ?> destinationColmun;
    @FXML
    private TableColumn<?, ?> totalpriceColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnClick(ActionEvent event) throws Exception{
                                Parent mainSceneParent = FXMLLoader.load(getClass().getResource("TransportOperatorDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void editproductinfoOnclick(ActionEvent event) throws Exception{
                        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("EditTransportableProductInfo.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void showproductOnclick(ActionEvent event) {
    }
    
}

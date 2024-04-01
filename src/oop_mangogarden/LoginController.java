
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User-pc
 */
public class LoginController implements Initializable {

    @FXML
    private TextField nameTextfield;
    @FXML
    private TextField idTextfield;
    @FXML
    private ComboBox<String> employeetypeCombobox;
    @FXML
    private TextField passwordTextfield;
    



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        employeetypeCombobox.getItems().addAll("Accountant", "Transport Operator",
                "Garden Manager", "Supply Chain Manager", "IT Admin", "Horticulturist","CEO");

    }    

    @FXML
    private void loginOnclick(ActionEvent event) {
    }

    @FXML
    private void createaccOnclick(ActionEvent event) throws Exception{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLCreateAccount.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}

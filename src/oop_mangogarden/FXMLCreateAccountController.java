
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User-pc
 */
public class FXMLCreateAccountController implements Initializable {

    @FXML
    private ComboBox<String> employeetypeCombobox;
    @FXML
    private TextField nameTextfield;
    @FXML
    private TextField idTextfield;
    @FXML
    private TextField contactTextfield;
    @FXML
    private RadioButton maleRadio;
    @FXML
    private RadioButton femaleRadio;
    @FXML
    private RadioButton othersRadio;
    @FXML
    private TextField passwordTextfield;
    
    ToggleGroup tg;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            employeetypeCombobox.getItems().addAll("Accountant", "Transport Operator",
            "Garden Manager", "Supply Chain Manager", "IT Admin", "Horticulturist","CEO");
            
            tg = new ToggleGroup();
            maleRadio.setToggleGroup(tg);
            femaleRadio.setToggleGroup(tg);
            othersRadio.setToggleGroup(tg);

    }    

    @FXML
    private void backOnclick(ActionEvent event) throws Exception{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void saveOnclick(ActionEvent event) {
    }
    
}

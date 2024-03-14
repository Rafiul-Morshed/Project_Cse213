
package oop_mangogarden;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
    private ComboBox<?> employeetypeCombobox;
    @FXML
    private TextField passwordTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginOnclick(ActionEvent event) {
    }
    
}

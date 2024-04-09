
package oop_mangogarden;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class BillAdjustmentController implements Initializable {

    @FXML
    private TextField orderidTextfield;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> quantityColumn;
    @FXML
    private TableColumn<?, ?> totalpriceColumn;
    @FXML
    private TableColumn<?, ?> paidColumn;
    @FXML
    private TableColumn<?, ?> dueColumn;
    @FXML
    private TextField quantityTextfield;
    @FXML
    private TextField paidTYextfield;
    @FXML
    private TextField dueTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backOnclick(ActionEvent event) {
    }

    @FXML
    private void showbillOnclick(ActionEvent event) {
    }

    @FXML
    private void adjustOnclick(ActionEvent event) {
    }

    @FXML
    private void showadjustbillOnclick(ActionEvent event) {
    }
    
}

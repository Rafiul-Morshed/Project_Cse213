
package oop_mangogarden;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User-pc
 */
public class CreateBillController implements Initializable {

    @FXML
    private TextField clientnameTextfield;
    @FXML
    private TextField addressTextfield;
    @FXML
    private TextField issuedateTextfield;
    @FXML
    private TextField productnameTextfield;
    @FXML
    private TextField quantityTextfield;
    @FXML
    private TextField invoiceTextfield;
    @FXML
    private TableView<Bill> tableview;
    @FXML
    private TableColumn<Bill, Integer> invoiceColumn;
    @FXML
    private TableColumn<Bill, String> productnameColumn;
    @FXML
    private TableColumn<Bill, Integer> issuedateColumn;
    @FXML
    private TableColumn<Bill, Integer> quantityColumn;
    @FXML
    private TableColumn<Bill, Float> totalpriceColumn;
    
    ArrayList<Bill> createbillList;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createbillList = new ArrayList<Bill>();
        
        invoiceColumn.setCellValueFactory(new PropertyValueFactory<Bill,Integer>("invoice"));
        productnameColumn.setCellValueFactory(new PropertyValueFactory<Bill,String>("productName"));
        issuedateColumn.setCellValueFactory(new PropertyValueFactory<Bill,Integer>("issueDate"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<Bill,Integer>("quantity"));
        totalpriceColumn.setCellValueFactory(new PropertyValueFactory<Bill,Float>("totalPrice"));
        
    }    

    @FXML
    private void backOnclick(ActionEvent event) throws Exception{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void creatOnclick(ActionEvent event) {
                Float total=100.00f;
                createbillList.add(
                    new Bill(
                        clientnameTextfield.getText(),
                        addressTextfield.getText(),
                        Integer.parseInt(issuedateTextfield.getText()),
                        productnameTextfield.getText(),
                        Integer.parseInt(quantityColumn.getText()),
                        Integer.parseInt(invoiceTextfield.getText()),
                        total
                    
                    )
        
                );
    }

    @FXML
    private void shownewbillOnclick(ActionEvent event) {
    }
    
}


package oop_mangogarden;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
    @FXML
    private TextField customernameTextfield;
    
    
    
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
//        
//        File f = null;
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try{
//            f = new File("CreateBill_01.txt");
//            if(f.exists()){
//                fos = new FileOutputStream(f, true);
//                oos = new ObjectOutputStream(fos);
//                
//            }
//            else{
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);
//            }
//            //String customerName, String address, int issueDate
//            //String productname, int quantity, int invoiceNo, Float totalPrice
//            Float total = 100.00f;
//            Bill b = new Bill(customernameTextfield.getText(), addressTextfield.getText(), 
//                    Integer.parseInt(issuedateTextfield.getText()), productnameTextfield.getText(),
//                    Integer.parseInt(quantityTextfield.getText()), Integer.parseInt(invoiceTextfield.getText()), total);
//            
//            oos.writeObject(b); 
//            
//            customernameTextfield.clear(); addressTextfield.clear();
//            issuedateTextfield.clear(); productnameTextfield.clear();
//            quantityTextfield.clear(); invoiceTextfield.clear();
//            
//        }
//        catch(IOException e){
//            
//            
//        }
        
        
        
//                Float total=100.00f;
//                createbillList.add(
//                    new Bill(
//                        customernameTextfield.getText(),
//                        addressTextfield.getText(),
//                        Integer.parseInt(issuedateTextfield.getText()),
//                        productnameTextfield.getText(),
//                        Integer.parseInt(quantityColumn.getText()),
//                        Integer.parseInt(invoiceTextfield.getText()),
//                        total
//                    
//                    )
//        
//                );
    }

    @FXML
    private void shownewbillOnclick(ActionEvent event) {
    }
    
}

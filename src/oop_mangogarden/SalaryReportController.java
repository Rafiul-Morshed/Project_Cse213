/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SalaryReportController implements Initializable {

    @FXML
    private ComboBox<String> employeetypeCombobox;
    @FXML
    private TableView<Salary> tableview;
    @FXML
    private TableColumn<Salary, String> employeetypeColumn;
    @FXML
    private TableColumn<Salary, String> idColumn;
    @FXML
    private TableColumn<Salary, String> salaryColumn;
    @FXML
    private TableColumn<Salary, String> employeenameColmun;
    @FXML
    private ComboBox<String> employeenameCombobox;

    // get_user_list(){
    // file read and store all data to an array
    //return array
   //}
    //ArrayList<Salary> salaryreportList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
                // arr = getUserList() 
        employeetypeCombobox.getItems().addAll("Accountant", "Transport Operator",
                "Garden Manager", "Supply Chain Manager", "IT Admin", "Horticulturist","CEO");
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
    private void showreportOnclick(ActionEvent event) {
    }
    
}

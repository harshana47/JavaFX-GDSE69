package lk.ijse.gdse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.gdse.DB.DB;
import lk.ijse.gdse.Model.Customer;

public class CustomerFormController {

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String id = txtID.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());

        Customer customer = new Customer(id, name, age);
        DB.customerArrayList.add(customer);

        System.out.println(DB.customerArrayList);
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}

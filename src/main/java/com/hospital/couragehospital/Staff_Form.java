package com.hospital.couragehospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import com.hospital.couragehospital.App.AppController;
import com.hospital.couragehospital.model.Gender;
import com.hospital.couragehospital.model.Role;
import javafx.stage.Stage;


import java.io.IOException;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Staff_Form implements Initializable {
    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private DatePicker dob;

    @FXML
    private ComboBox gender;

    @FXML
    private ComboBox role;

    @FXML
    private TextField contact;


    @FXML
    private TextField password;

    @FXML
    private TextField confirmpsd;

    @FXML
    private Button cancel;

    @FXML
    private Button save;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AppController.setInstance();
        gender.getItems().addAll(Gender.values());
        role.getItems().addAll(Role.values());
    }

    @FXML
    public void onCancelClick(ActionEvent event)  throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchToPatient(ActionEvent event) {

    }

    @FXML
    public void onSaveClick() {
        String fname = firstname.getText();
        String lname = lastname.getText();
        String dob = null;
        String gd = gender.getValue() == null ? "" : gender.getValue().toString();
        String rl = role.getValue() == null ? "" : role.getValue().toString();
        String cont  = contact.getText();
        String  psd= password.getText();


        AppController.createStaff(fname,lname, dob,gd,rl,cont,psd);

    }


}
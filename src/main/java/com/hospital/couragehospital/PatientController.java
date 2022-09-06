package com.hospital.couragehospital;

import com.hospital.couragehospital.App.AppController;
import com.hospital.couragehospital.model.Gender;
import com.hospital.couragehospital.model.Role;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PatientController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AppController.setInstance();
        gender.getItems().addAll(Gender.values());
    }

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private TextField name;

    @FXML
    private TextField contact;

    @FXML
    private DatePicker dob;

    @FXML
    private ComboBox gender;

    @FXML
    private TextField email;

    @FXML
    private TextArea diagnosis;

    @FXML
    private Button cancel;

    @FXML
    private Button save;


    @FXML
    public void onCancelClick(ActionEvent event)  throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onSaveClick() {
        String fn = name.getText();
        String db = dob.getValue().toString();
        String gd = gender.getValue() == null ? "" : gender.getValue().toString();
        var cont = contact.getText();
        String  em= email.getText();
        String dg = diagnosis.getText();

        AppController.createPatient(fn, db,gd,cont,em,dg);

    }
}

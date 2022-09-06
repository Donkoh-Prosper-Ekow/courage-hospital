package com.hospital.couragehospital;


import com.hospital.couragehospital.App.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppointmentController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AppController.setInstance();
    }


    @FXML
    private TextField appid;

    @FXML
    private TextField patid;
    @FXML
    private DatePicker date;

    @FXML
    private TextField time;

    @FXML
    private TextField conroom;

    @FXML
    private TextField specialist;

    @FXML
    private TextArea diagnosis;

    @FXML
    private Button cancel;

    @FXML
    private Button save;


    @FXML
    public void onCancelClick(ActionEvent event)  throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onSaveClick() {
        String aid = appid.getText();
        String pid = patid.getText();
        String dt = date.getValue().toString();
        String tm = time.getText();
        String  crm= conroom.getText();
        String  sp= specialist.getText();
        String dg = diagnosis.getText();

        AppController.createPatient(aid, pid,dt,tm,crm,sp,dg);

    }

}

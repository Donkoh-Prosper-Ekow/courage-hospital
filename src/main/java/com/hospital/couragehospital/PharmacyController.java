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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PharmacyController implements Initializable {
    @FXML
    private TextField drugid;

    @FXML
    private TextField drugname;
    @FXML
    private TextField dis;

    @FXML
    private TextField doos;
    
    @FXML
    private TextField price;
    
    @FXML
    private TextField manudate;

    @FXML
    private TextField expdate;

    @FXML
    private Button cancel;

    @FXML
    private Button save;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AppController.setInstance();
    }

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
        String did = drugid.getText();
        String dnm = drugname.getText();
        String mdate = manudate.getText();
        String edate = expdate.getText();
        String instock  = dis.getText();
        String  outstock= doos.getText();
        String  prc= price.getText();



        AppController.createStaff(did,dnm, mdate,edate,instock,outstock,prc);

    }

}

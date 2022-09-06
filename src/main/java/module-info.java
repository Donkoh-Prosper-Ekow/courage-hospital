module com.hospital.couragehospital {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.hospital.couragehospital to javafx.fxml;
    exports com.hospital.couragehospital;
    exports com.hospital.couragehospital.App;
    opens com.hospital.couragehospital.App to javafx.fxml;
    exports com.hospital.couragehospital.model;
    opens com.hospital.couragehospital.model to javafx.fxml;
}
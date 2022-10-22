module ism.inscription {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    // requires mysql.connector.java;

    opens ism.inscription.controllers to javafx.fxml;

    exports ism.inscription;
}

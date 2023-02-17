module com.mycompany.btth {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.btth to javafx.fxml;
    exports com.mycompany.btth;
}

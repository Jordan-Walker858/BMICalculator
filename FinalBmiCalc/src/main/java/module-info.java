module com.mycompany.finalbmicalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.finalbmicalc to javafx.fxml;
    exports com.mycompany.finalbmicalc;
}

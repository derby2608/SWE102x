module com.example.swe102x_assignment3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swe102x_assignment3 to javafx.fxml;
    exports com.example.swe102x_assignment3;
}
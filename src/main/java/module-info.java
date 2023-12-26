module com.regalo.regalo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.regalo.regalo to javafx.fxml;
    exports com.regalo.regalo;
}
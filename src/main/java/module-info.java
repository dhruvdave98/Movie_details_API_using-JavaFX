module com.example.javaapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.javaapi to javafx.fxml, com.google.gson;
    exports com.example.javaapi;
    exports com.example.javaapi.Controllers;
    opens com.example.javaapi.Controllers to com.google.gson, javafx.fxml;
}
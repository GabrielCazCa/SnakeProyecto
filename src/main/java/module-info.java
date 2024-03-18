module com.example.snakeproyecto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.snakeproyecto to javafx.fxml;
    exports com.example.snakeproyecto;
}
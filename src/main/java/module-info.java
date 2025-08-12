module com.example.finalexam {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.finalexam to javafx.fxml, com.google.gson;
    exports com.example.finalexam;
}
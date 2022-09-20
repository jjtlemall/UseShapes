module com.example.useshapes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.useshapes to javafx.fxml;
    exports com.example.useshapes;
}
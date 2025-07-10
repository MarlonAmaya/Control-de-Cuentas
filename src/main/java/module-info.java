module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx to javafx.fxml;
    opens org.openjfx.model to javafx.base;
    
    exports org.openjfx;
}

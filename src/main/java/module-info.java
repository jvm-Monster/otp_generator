module org.justmeandcode.otp_generator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;


    opens org.justmeandcode.otp_generator to javafx.fxml;
    exports org.justmeandcode.otp_generator;
}
package org.justmeandcode.otp_generator;

import java.awt.datatransfer.StringSelection;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label OTP_VALUE;

    @FXML
    private Slider OTP_size_slider;

    @FXML
    private Label notification;

    @FXML
    private RadioButton alphaNumericRadioButton;

    @FXML
    private Button generate_otp_code;

    @FXML
    private RadioButton numericRadioButton;


    @FXML
    void onChooseAlphaNumeric(ActionEvent event) {
            alphaNumericRadioButton.setSelected(true);
            numericRadioButton.setSelected(false);
    }

    @FXML
    void onChooseNumeric(ActionEvent event) {
        numericRadioButton.setSelected(true);
        alphaNumericRadioButton.setSelected(false);
    }



    @FXML
    void onGenerateOTPCode(ActionEvent event) {
        double val = OTP_size_slider.getValue();
        int sliderValue = (int) val;

        String password = numericRadioButton.isSelected() ?
                NumericOTPGenerator.generatePassword(sliderValue) :
                AlphaNumericOTPGenerator.generateAlphaNumericPassword(sliderValue);

        OTP_VALUE.setText(password);

        // Immediately show that the OTP is being generated
        notification.setText("Generating OTP...");
        CopyPassword.copy(password);
        notification.setText("OTP generated and copied");

        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        pause.setOnFinished(e -> {
            notification.setText("");
        });
        pause.play();


    }


    @FXML
    void onSlide(MouseEvent event) {

    }

    @FXML
    void initialize() {

        numericRadioButton.setSelected(true);

    }

}
